package com.wz.annotation;

public @interface MyAnnotation1 {
    //只有一个参数的时候，建议使用value作为参数名，这样使用该注解的时候，可以省略参数名
    String value();
}
