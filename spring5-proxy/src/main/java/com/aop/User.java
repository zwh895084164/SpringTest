package com.aop;

import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
public class User {

    public void add() {
        System.out.println("执行add----");
    }
}
