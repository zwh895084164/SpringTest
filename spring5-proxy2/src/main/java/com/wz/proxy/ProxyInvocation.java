package com.wz.proxy;



import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


public class ProxyInvocation implements InvocationHandler {

    //被代理的接口
    private Object object;

    public void setRent(Object object) {
        this.object  = object;
    }
    //由于Rent是个接口，所以只能用.class获取类型类
    Class[] cc={Rent.class};
    //Class<?>[] cc=rent.getClass().getInterfaces();
    //生成代理类
    public Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),object.getClass().getInterfaces(),this);
    }
    //处理代理实例，返回结果
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //动态代理本质，反射的实现
        Object o=method.invoke(object,args);
        return o;
    }

    public void seeHourse() {
        System.out.println("看房子");
    }
}
