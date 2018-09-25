package com.example.demo.config;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * 创建时间 2018年九月21日 星期五 15:22
 * 作者: zhangjunping
 *
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface RemoteService {
    ServiceType serviceType() default ServiceType.HTTP;
    Class<?> serviceInterface();
}
