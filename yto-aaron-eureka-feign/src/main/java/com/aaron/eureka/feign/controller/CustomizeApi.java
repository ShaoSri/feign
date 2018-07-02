package com.aaron.eureka.feign.controller;

import com.aaron.eureka.feign.clientinterface.StoreClient;
import feign.Feign;
import feign.auth.BasicAuthRequestInterceptor;
import feign.codec.Decoder;
import feign.codec.Encoder;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Aaron
 * @version V1.0
 * @Title: CustomizeApi
 * @Description: 自定义Feign客户端
 * @date 2018/7/2
 */
@Import(StoreClient.class)
@RestController
public class CustomizeApi {
	
	private StoreClient storeClient;
	
	public CustomizeApi(){
		this.storeClient = Feign.builder()
				.encoder(new Encoder.Default())
				.decoder(new Decoder.Default())
				.requestInterceptor(new BasicAuthRequestInterceptor("user","password"))
				.target(StoreClient.class,"http://stores");
	}
	
	
	@GetMapping(name = "/consumer")
	public String  getInfo(){
		return storeClient.consumer();
	}
	
	
	
}
