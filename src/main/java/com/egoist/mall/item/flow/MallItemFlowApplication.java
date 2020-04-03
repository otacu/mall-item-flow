package com.egoist.mall.item.flow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MallItemFlowApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallItemFlowApplication.class, args);
    }

}
