package com.aaron.eureka.feign.config;

import feign.Contract;
import feign.Logger;
import feign.auth.BasicAuthRequestInterceptor;
import org.springframework.context.annotation.Bean;

/**
 * @author Aaron
 * @version 1.0
 * @Title: 通过FooConfiguration指明外部配置类
 * @Description:
 * @date
 */
public class FooConfiguration {

    @Bean
    public Contract feignContract() {
        return new feign.Contract.Default();
    }
    
    /**
     * euarka用户名密码
     * @return
     */
    @Bean
    public BasicAuthRequestInterceptor basicAuthRequestInterceptor() {
        return new BasicAuthRequestInterceptor("user", "password");
    }

    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}
