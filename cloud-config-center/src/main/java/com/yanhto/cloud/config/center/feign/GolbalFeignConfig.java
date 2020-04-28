package com.yanhto.cloud.config.center.feign;

import feign.Logger.Level;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GolbalFeignConfig {

	@Bean
	public Level levl(){
		return Level.FULL;
	}
}
