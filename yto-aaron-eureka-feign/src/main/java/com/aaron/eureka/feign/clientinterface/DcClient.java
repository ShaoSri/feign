package com.aaron.eureka.feign.clientinterface;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Aaron
 * @version 1.0
 * @Title: 客户端接口
 * @Description:
 * @date 20180629
 */
@FeignClient("ONE-CLOUD-CLIENT")
public interface DcClient {

    @GetMapping("/getServices")
    String consumer();
}
