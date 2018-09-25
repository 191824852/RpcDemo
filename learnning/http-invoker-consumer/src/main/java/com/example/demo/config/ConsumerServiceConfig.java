package com.example.demo.config;

import com.example.demo.service.UserMapperService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.httpinvoker.HttpInvokerProxyFactoryBean;

/**
 * 创建时间 2018年九月20日 星期四 19:52
 * 作者: zhangjunping
 */
@Configuration
public class ConsumerServiceConfig {

    @Bean
    public HttpInvokerProxyFactoryBean initUserMapperService(){
        HttpInvokerProxyFactoryBean factory = new HttpInvokerProxyFactoryBean();
        //http://218.241.234.222:8888/perceptor/
        //http://localhost:8888/test/userMapperService
        factory.setServiceUrl("http://localhost:8888/test/userMapperService");
        factory.setServiceInterface(UserMapperService.class);
        return factory;
    }
}
