package com.example.demo.service;

import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 创建时间 2018年九月21日 星期五 10:21
 * 作者: zhangjunping
 */
@Service
public interface UserMapperService {
    List<String> getUserNameByIds(List<String> ids);
}
