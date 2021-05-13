import com.entity.ZwhUser;
import com.service.BookService;
import com.wz.config.SpringConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBookService {
    @Test
    public void testBookService() {
/*        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService=context.getBean("bookService", BookService.class);
        ZwhUser zwhUser=new ZwhUser();
        zwhUser.setName("qqq");
        zwhUser.setPass("123qwe");
        zwhUser.setSex(1);
        zwhUser.setUserId("8877");
        bookService.add(zwhUser);*/
    }
    @Test
    public void testGet() {
        ApplicationContext context =new AnnotationConfigApplicationContext(SpringConfig.class);
        BookService bookService=context.getBean("bookService", BookService.class);
        ZwhUser zwhUser=bookService.get("007");
        System.out.println(zwhUser);
    }
}
