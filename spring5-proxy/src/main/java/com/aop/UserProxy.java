package com.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

import org.springframework.stereotype.Component;

@Component
//代理
@Aspect//标识这个类是切面
public class UserProxy {
    @Pointcut(value = "execution(* com.aop.User.add(..))")
    public void pointDemo() {

    }
    @Before(value = "pointDemo()")
    public void before() {
        System.out.println("bsfore----");
    }

    @After(value = "execution(* com.aop.User.add(..))")
    public void after() {
        System.out.println("after------");
    }

    @AfterReturning(value = "execution(* com.aop.User.add(..))")
    public void afterReturn() {
        System.out.println("afterReturning-----");
    }

    @Around(value = "execution(* com.aop.User.add(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕之前----");
        //执行被增强的方法
        proceedingJoinPoint.proceed();
        System.out.println("环绕之后----");
    }
}
