import com.wz.test.HelloWorld;
import com.wz.test.bean.Emp;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHelloWorld {
    @Test
    public void testHelloWorld() {
        ApplicationContext context =new ClassPathXmlApplicationContext("bean1.xml");

        HelloWorld h= context.getBean("hellospring", HelloWorld.class);
        h.HelloSpring();

    }
    @Test
    public void testEmp() {
        ApplicationContext context =new ClassPathXmlApplicationContext("bean1.xml");

        Emp h= context.getBean("emp", Emp.class);
        System.out.println(h);

    }
    @Test
    public void testEmp1() {
        ApplicationContext context =new ClassPathXmlApplicationContext("bean2.xml");

        Emp h= context.getBean("emp", Emp.class);
        System.out.println(h);

    }
}
