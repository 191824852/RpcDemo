package com.example.demo.config;

import com.example.demo.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.caucho.HessianServiceExporter;

/**
 * 创建时间 2018年九月18日 星期二 16:39
 * 作者: zhangjunping
 */
@Configuration
public class ServiceProviderConfig {

    @Autowired
    private HelloWorldService helloWorldService;

    @Bean(name = "/HelloWorldService")
    public HessianServiceExporter accountService(){
        HessianServiceExporter hessianServiceExporter = new HessianServiceExporter();
        hessianServiceExporter.setService(helloWorldService);
        hessianServiceExporter.setServiceInterface(HelloWorldService.class);
        return hessianServiceExporter;
    }
}
