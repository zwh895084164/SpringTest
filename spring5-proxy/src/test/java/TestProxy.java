
import com.aop.SpringConfig;
import com.aop.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestProxy {
    @Test
    public void testJDKProxy() {
        JDKProxy jdkProxy =new JDKProxy();
        jdkProxy.addProxy();
    }
    @Test
    public void testAop() {
        ApplicationContext context =new AnnotationConfigApplicationContext(SpringConfig.class);
        User user=context.getBean("user", User.class);
        user.add();
    }
}
