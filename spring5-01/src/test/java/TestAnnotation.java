import com.annotation.SpringConfig;
import com.annotation.Users;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnnotation {
    @Test
    public void testAnnotation() {
        ApplicationContext context =new ClassPathXmlApplicationContext("annotation.xml");

        Users h= context.getBean("uu", Users.class);
        h.add();
    }
    @Test
    public void testAnnotation1() {
        ApplicationContext context =new AnnotationConfigApplicationContext(SpringConfig.class);
        //这里的变量名“uuuu”  默认使用Users的别名，首字母小写；否则使用指定的别名uuuu
        Users h= context.getBean("uuuu", Users.class);
        h.add();
    }
}
