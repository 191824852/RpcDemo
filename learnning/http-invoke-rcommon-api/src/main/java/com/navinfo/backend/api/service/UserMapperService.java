package com.navinfo.backend.api.service;

import org.springframework.stereotype.Service;
import java.util.List;

/**
 * 创建时间 2018年九月20日 星期四 19:09
 * 作者: zhangjunping
 */
@Service
public interface UserMapperService {

    List<String> getUserNameByIds(List<String> ids);
}
