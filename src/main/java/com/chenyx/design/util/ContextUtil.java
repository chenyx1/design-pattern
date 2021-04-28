package com.chenyx.design.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author xsx
 * @date 2020/4/26
 * @since 1.8
 */
@Component
public class ContextUtil implements ApplicationContextAware {

    /**
     * 上下文
     */
    private static ApplicationContext applicationContext;

    /**
     * 设置上下文
     * @param applicationContext 上下文实例
     * @throws BeansException Bean异常
     */
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        ContextUtil.applicationContext = applicationContext;
    }

    /**
     * 获取上下文
     * @return
     */
    public static ApplicationContext getContext() {
        return ContextUtil.applicationContext;
    }
}
