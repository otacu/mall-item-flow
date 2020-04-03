package com.egoist.mall.item.flow.grpc.server;

import com.alibaba.fastjson.JSON;
import com.egoist.mall.grpc.generated.item.flow.ItemFlowProto;
import com.egoist.mall.grpc.generated.item.flow.ItemFlowServiceGrpc;
import com.egoist.mall.item.flow.grpc.client.ItemBasicServiceClient;
import com.egoist.mall.item.flow.pojo.Spu;
import com.egoist.mall.parent.constant.EgoistResultStatusConstant;
import com.egoist.mall.parent.pojo.EgoistResult;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import net.devh.springboot.autoconfigure.grpc.server.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
@GrpcService(ItemFlowProto.class)
public class ItemFlowServiceServer extends ItemFlowServiceGrpc.ItemFlowServiceImplBase {

    @Autowired
    private ItemBasicServiceClient itemBasicServiceClient;

    /**
     * @param request
     * @param responseObserver
     */
    @Override
    public void querySpuById(ItemFlowProto.QuerySpuByIdRequest request, StreamObserver<ItemFlowProto.QuerySpuByIdResponse> responseObserver) {
        final ItemFlowProto.QuerySpuByIdResponse.Builder responseBuilder = ItemFlowProto.QuerySpuByIdResponse.newBuilder();
        EgoistResult result = this.doQuerySpuById(request.getId());
        if (EgoistResult.isOk(result)) {
            responseBuilder.setData((ItemFlowProto.QuerySpuByIdData.Builder) result.getData());
        }
        responseBuilder.setStatus(result.getStatus());
        responseBuilder.setMsg(result.getMsg());
        responseObserver.onNext(responseBuilder.build());
        responseObserver.onCompleted();
    }

    private EgoistResult doQuerySpuById(String id) {
        try {
            EgoistResult querySpuResult = itemBasicServiceClient.querySpuById(Long.parseLong(id));
            if (EgoistResult.isNotOk(querySpuResult)) {
                return new EgoistResult(EgoistResultStatusConstant.STATUS_400, "查询SPU失败");
            }
            Spu spu = JSON.parseObject((String)querySpuResult.getData(), Spu.class);
            ItemFlowProto.QuerySpuByIdData.Builder dataBuilder = ItemFlowProto.QuerySpuByIdData.newBuilder();
            dataBuilder.setId(id);
            dataBuilder.setCnName(spu.getCnName());
            dataBuilder.setBrand("TODO");
            dataBuilder.setOriginCountry("TODO");
            dataBuilder.setProductionCountry("TODO");
            dataBuilder.setCategory("TODO");
            return EgoistResult.ok(dataBuilder);
        } catch (Exception e) {
            log.error(String.format("查询SPU（id=%s）异常", id), e);
            return new EgoistResult(EgoistResultStatusConstant.STATUS_400, "查询SPU异常");
        }
    }
}
