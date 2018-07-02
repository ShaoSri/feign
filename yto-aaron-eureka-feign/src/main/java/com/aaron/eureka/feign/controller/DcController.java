package com.aaron.eureka.feign.controller;

import com.aaron.eureka.feign.clientinterface.DcClient;
import com.aaron.eureka.feign.clientinterface.StoreClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName: DcController
 * @Description : eureka服务消费者
 * @Author Aaron
 * @Date 2018/6/25
 * @Version 1.0
 */

@RestController
public class DcController {
    private final Logger logger = LoggerFactory.getLogger(DcController.class);

    @Autowired
    DcClient dcClient;

    @Autowired
    StoreClient storeClient;

    @GetMapping("/consumer")
    public String dc() {
        return storeClient.consumer();
    }


}
