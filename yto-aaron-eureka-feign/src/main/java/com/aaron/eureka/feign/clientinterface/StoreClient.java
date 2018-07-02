package com.aaron.eureka.feign.clientinterface;

import com.aaron.eureka.feign.component.ServiceFallback;
import com.aaron.eureka.feign.config.FooConfiguration;
import feign.RequestLine;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * @author Aaron
 * @version 1.0
 * @Title: fegin客户端集合
 * @Description:
 * @date 20180629
 */
@FeignClient(name = "${eureka.service.instance}",
        configuration = FooConfiguration.class,fallback = ServiceFallback.class)
public interface StoreClient {

    @RequestLine("GET /getServices")
    String consumer();

}
