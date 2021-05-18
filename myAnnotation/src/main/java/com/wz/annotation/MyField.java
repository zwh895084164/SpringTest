package com.wz.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)//注解在字段上面
@Retention(RetentionPolicy.RUNTIME)
public @interface MyField {
    String desc();
    int length();
}
