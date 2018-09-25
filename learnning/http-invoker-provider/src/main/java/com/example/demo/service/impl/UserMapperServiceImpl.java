package com.example.demo.service.impl;

import com.example.demo.service.UserMapperService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * 创建时间 2018年九月20日 星期四 19:12
 * 作者: zhangjunping
 */
@Service
public class UserMapperServiceImpl implements UserMapperService {

    @Override
    public List<String> getUserNameByIds(List<String> ids) {
        ids.forEach(System.out::print);
        return Arrays.asList("测试","ceshi1");
    }
}
