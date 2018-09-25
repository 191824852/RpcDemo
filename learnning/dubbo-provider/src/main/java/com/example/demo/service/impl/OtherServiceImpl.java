package com.example.demo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.demo.entity.UserEntity;
import com.example.demo.service.DemoService;
import com.example.demo.service.OtherService;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建时间 2018年九月18日 星期二 15:30
 * 作者: zhangjunping
 */
@Service(
        version = "${demo.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class OtherServiceImpl implements OtherService {


    @Override
    public List<String> getAllUsers(UserEntity userEntity) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add(userEntity.getUserName());
        strings.add(userEntity.getSex());
        return strings;
    }
}
