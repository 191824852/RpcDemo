package com.example.demo.service.impl;

import com.example.demo.service.HelloWorldService;
import org.springframework.stereotype.Service;

/**
 * 创建时间 2018年九月18日 星期二 16:37
 * 作者: zhangjunping
 */
@Service
public class HelloWorldServiceImpl implements HelloWorldService{
    @Override
    public String helloWorld(String name) {
        System.out.println("有人在调用该服务！参数（name）:" + name);
        return  name + "HelloWorld";
    }
}
