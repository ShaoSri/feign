package com.aaron.eureka.feign;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Hello world!
 *
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication

public class AppFeign
{


    public static void main(String[] args) {
        new SpringApplicationBuilder(AppFeign.class).web(true).run(args);
    }
}
