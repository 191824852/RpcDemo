package com.example.demo.config;

import com.example.demo.service.UserMapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.httpinvoker.HttpInvokerServiceExporter;

/**
 * 创建时间 2018年九月20日 星期四 19:48
 * 作者: zhangjunping
 */
@Configuration
public class ProviderServiceConfig {

    @Autowired
    private UserMapperService userMapperService;

    @Bean(name="/userMapperService")
    public HttpInvokerServiceExporter userMapperServiceExporter(){
        HttpInvokerServiceExporter invokerServiceExporter = new HttpInvokerServiceExporter();
        invokerServiceExporter.setService(userMapperService);
        invokerServiceExporter.setServiceInterface(UserMapperService.class);
        return invokerServiceExporter;
    }
}
