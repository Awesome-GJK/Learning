package com.gjk.spring.configuartion.proxyBeanMethod.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.gjk.spring.configuartion.proxyBeanMethod.bean.Teacher;

/**
 * ProxyBeanMethodTrue
 *
 * @author: GJK
 * @date: 2024/1/11 11:57
 * @description:
 */
@Configuration(proxyBeanMethods = true)
@ConditionalOnProperty(prefix = "proxy.bean.method", name = "enable", havingValue = "true")
public class ProxyBeanMethodTrue {

    @Bean
    public Teacher teacher(){
        Teacher teacher = new Teacher("刘涛");
        return teacher;
    }

}
