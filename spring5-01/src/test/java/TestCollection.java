import com.wz.collection.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class TestCollection {
    @Test
    public void testCollection() {
        ApplicationContext context =new ClassPathXmlApplicationContext("collection.xml");

        Student h= context.getBean("student", Student.class);
        System.out.println(Arrays.toString(h.getCourses()));
        System.out.println(h.getList());
        System.out.println(h.getMaps());
        System.out.println(h.getSet());
        System.out.println(h.getCourseList());

    }
    @Test
    public void testCollection1() {
        ApplicationContext context =new ClassPathXmlApplicationContext("collection1.xml");

        Student h= context.getBean("student", Student.class);

        System.out.println(h.getCourseList());

    }
}
