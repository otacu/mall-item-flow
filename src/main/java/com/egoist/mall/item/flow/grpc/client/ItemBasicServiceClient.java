package com.egoist.mall.item.flow.grpc.client;

import com.egoist.mall.grpc.generated.item.basic.ItemBasicProto;
import com.egoist.mall.grpc.generated.item.basic.ItemBasicServiceGrpc;
import com.egoist.mall.parent.pojo.EgoistResult;
import com.googlecode.protobuf.format.JsonFormat;
import io.grpc.Channel;
import lombok.extern.slf4j.Slf4j;
import net.devh.springboot.autoconfigure.grpc.client.GrpcClient;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ItemBasicServiceClient {

    @GrpcClient("item-basic")
    private Channel serverChannel;

    public EgoistResult querySpuById(Long id) {
        ItemBasicServiceGrpc.ItemBasicServiceBlockingStub stub= ItemBasicServiceGrpc.newBlockingStub(serverChannel);
        ItemBasicProto.QuerySpuByIdResponse response = stub.querySpuById(ItemBasicProto.QuerySpuByIdRequest.newBuilder().setId(id).build());
        return new EgoistResult(response.getStatus(), response.getMsg(), new JsonFormat().printToString(response.getData()));
    }

}
