package aop.log;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Component
public class Log implements MethodBeforeAdvice {

    //menthod  要执行的目标对象的方法
    //args 参数
    //target  目标对象
    @Override
    public void before(Method method, Object[] objects, Object target) throws Throwable {
        System.out.println(target.getClass().getName()+"的"+method.getName()+"执行。。。");
    }
}
