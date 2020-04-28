package com.yamhto.cloud.rest.template.conf;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

/**
 * @author yamhto
 * @className: RestTemplateConf.java
 * @package com.yamhto.cloud.rest.template
 * @description:
 * @date 2020/3/9 15:10
 */
@Configuration
public class RestTemplateConf {


    //最好是用不注释的方法，在注入的同时设置连接时间，这种注释的也可以，但是没有设置超时时间
    /*@Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder){
        return builder.build();
    }*/

    /**
     * rest + ribbon 负载均衡
     *
     * @param factory
     * @return
     */
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(@Qualifier("simpleClientHttpRequestFactory") ClientHttpRequestFactory factory) {
        return new RestTemplate(factory);
    }

    @Bean("simpleClientHttpRequestFactory")
    public ClientHttpRequestFactory simpleClientHttpRequestFactory() {
        SimpleClientHttpRequestFactory factory = new SimpleClientHttpRequestFactory();
        factory.setReadTimeout(5000);//单位为ms
        factory.setConnectTimeout(5000);//单位为ms
        return factory;
    }
}
