package com.aaron.eureka.feign.component;

import com.aaron.eureka.feign.clientinterface.StoreClient;
import org.springframework.stereotype.Component;

/**
 * @author Aaron
 * @version V1.0
 * @Title: ServiceFallback
 * @Description: 服务降级组件
 * @date 2018/7/2
 */
@Component
public class ServiceFallback implements StoreClient {
	
	/**
	 * 服务降级
	 * @return
	 */
	@Override
	public String consumer() {
		return "This is a error";
	}
	
	
	
}
