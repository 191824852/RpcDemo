package com.example.demo.controller;

import com.example.demo.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 创建时间 2018年九月18日 星期二 17:23
 * 作者: zhangjunping
 */
@RestController
public class ConsumerController {

    @Autowired
    private  HelloWorldService helloWorldService;
    @GetMapping("/sayHello")
    public String sayHello(String name){
        return helloWorldService.helloWorld(name);
    }

}
