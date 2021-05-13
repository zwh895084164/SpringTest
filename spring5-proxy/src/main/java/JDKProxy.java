import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class JDKProxy {
    public void addProxy() {
        Class[] interfaces ={UserDao.class};
        UserDaoImpl userDao=new UserDaoImpl();
        UserDao userDao1=(UserDao)Proxy.newProxyInstance(JDKProxy.class.getClassLoader(),interfaces,new UserDaoProxy(userDao));
        int result=userDao1.add(1,2);
        System.out.println(result);
    }
}
//创建代理对象
class UserDaoProxy implements InvocationHandler {

    //把创建的是谁的代理对象，把谁传递过来
    private Object obj;
    public  UserDaoProxy(Object obj) {
        this.obj=obj;
    }
    //增强的逻辑
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("方法前执行增强代码"+method.getName()+"，传递的参数"+ Arrays.toString(args));
        Object o=method.invoke(obj,args);
        System.out.println("方法后执行增强代码");

        return o;
    }
}