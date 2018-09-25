package com.example.demo.controller;

import com.example.demo.service.UserMapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * 创建时间 2018年九月20日 星期四 19:51
 * 作者: zhangjunping
 */
@RestController
public class IndexController {

    @Autowired
    private UserMapperService userMapperService;

    @RequestMapping("/")
    public List<String> getUserNameByIds(){
        return  userMapperService.getUserNameByIds(Arrays.asList("1","2"));
    }

}

