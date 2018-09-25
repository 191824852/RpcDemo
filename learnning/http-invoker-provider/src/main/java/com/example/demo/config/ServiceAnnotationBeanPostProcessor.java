package com.example.demo.config;

import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessorAdapter;
import org.springframework.core.PriorityOrdered;

/**
 * 创建时间 2018年九月21日 星期五 15:28
 * 作者: zhangjunping
 */
public class ServiceAnnotationBeanPostProcessor extends InstantiationAwareBeanPostProcessorAdapter implements PriorityOrdered {
    @Override
    public int getOrder() {
        return 0;
    }
}
