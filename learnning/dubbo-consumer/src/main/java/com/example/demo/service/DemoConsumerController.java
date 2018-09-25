package com.example.demo.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.demo.entity.UserEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 创建时间 2018年九月18日 星期二 15:35
 * 作者: zhangjunping
 */
@RestController
public class DemoConsumerController {
    @Reference(version = "${demo.service.version}",
            application = "${dubbo.application.id}",
            url = "dubbo://localhost:12345")
    private DemoService demoService;

    @Reference(version = "${demo.service.version}",
            application = "${dubbo.application.id}",
            url = "dubbo://localhost:12345")
    private OtherService otherService;

    @RequestMapping("/sayHello")
    public String sayHello(@RequestParam String name) {
        return demoService.sayHello(name);
    }

    @RequestMapping("/getUser")
    public List<String> sayHello(UserEntity userEntity) {
        return otherService.getAllUsers(userEntity);
    }
}
