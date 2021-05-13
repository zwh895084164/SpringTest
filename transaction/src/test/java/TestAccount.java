import com.service.BookService;
import com.service.UserService;
import com.wz.config.SpringConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.TestExecutionListeners;

public class TestAccount {
    @Test
    public void testAccount() {
        ApplicationContext context =new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService=context.getBean("userService", UserService.class);
        userService.account();
    }
    @Test
    public void testAccounttx() {

    }
}
