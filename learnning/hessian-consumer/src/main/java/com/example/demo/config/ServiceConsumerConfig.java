package com.example.demo.config;

import com.example.demo.service.HelloWorldService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.caucho.HessianProxyFactoryBean;

/**
 * 创建时间 2018年九月18日 星期二 17:19
 * 作者: zhangjunping
 */
@Configuration
public class ServiceConsumerConfig {
    @Bean
    public HessianProxyFactoryBean helloClient() {
        HessianProxyFactoryBean factory = new HessianProxyFactoryBean();
        factory.setServiceUrl("http://localhost:9000/HelloWorldService");
        factory.setServiceInterface(HelloWorldService.class);
        return factory;
    }
}
