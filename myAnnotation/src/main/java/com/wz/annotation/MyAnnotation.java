package com.wz.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    //注解的参数 参数类型+参数名()
    String name();
    //有默认值，使用的时候不一定要给注解赋值
    int age() default 0;
    //String[] schools();
}

