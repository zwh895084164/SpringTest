import Config.SpringConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.UserService;
import service.UserServiceImpl;

public class TestAop {
    @Test
    public void testAop() {
        ApplicationContext context =new AnnotationConfigApplicationContext(SpringConfig.class);

    }
    @Test
    public void testAop1() {
        ApplicationContext context =new ClassPathXmlApplicationContext("bean1.xml");
        //这里注意动态代理代理的是接口，所以需要返回的是接口而不是实现类
        UserService userService=context.getBean("userService", UserService.class);
        userService.add();
    }
}
