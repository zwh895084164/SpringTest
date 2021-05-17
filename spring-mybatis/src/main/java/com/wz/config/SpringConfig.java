package com.wz.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("spring-bean.xml")
@ComponentScan(basePackages = "com.wz")
public class SpringConfig {
}
