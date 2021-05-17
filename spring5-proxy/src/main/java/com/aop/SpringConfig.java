package com.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
//开启AspectJ 自动代理模式,如果不填proxyTargetClass=true，默认为false，
//替换xml配置文件
//
//参数proxyTargetClass  true——使用CGLIB基于类创建代理；false——使用java接口创建代理
@EnableAspectJAutoProxy
@ComponentScan(basePackages = "com.aop")
public class SpringConfig {
}
