package com.egoist.mall.item.flow.grpc.client;

import com.egoist.mall.parent.pojo.EgoistResult;
import com.egoist.mall.parent.util.json.EgoistJsonUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestItemBasicServiceClient {

    @Autowired
    private ItemBasicServiceClient itemBasicServiceClient;

    @Test
    public void testCreateOrderSubDocByIdx() throws Exception {
        EgoistResult result = itemBasicServiceClient.querySpuById(1L);
        System.out.println(EgoistJsonUtil.objectToJson(result));
    }
}
