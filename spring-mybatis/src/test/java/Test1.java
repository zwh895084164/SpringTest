import com.wz.config.SpringConfig;
import com.wz.dao.ZwhUserDao;
import com.wz.pojo.ZwhUser;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Test1 {
    @Test
    public void test1() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream= Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
        //设置自动提交事务
        SqlSession sqlSession=sqlSessionFactory.openSession(true);
        ZwhUserDao zwhUserDao=sqlSession.getMapper(ZwhUserDao.class);
        List<ZwhUser> zwhUserList=zwhUserDao.getZwhUserList();
        for (ZwhUser zwhUser : zwhUserList) {
            System.out.println(zwhUser);
        }

    }
    @Test
    public void test2() {
        ApplicationContext context =new AnnotationConfigApplicationContext(SpringConfig.class) ;

        ZwhUserDao h= context.getBean("zwhUserMapperImpl", ZwhUserDao.class);
        for (ZwhUser zwhUser : h.getZwhUserList()) {
            System.out.println(zwhUser);
        }
    }
    @Test
    public void test3() {
        ApplicationContext context =new ClassPathXmlApplicationContext("spring-bean.xml");

        ZwhUserDao h= context.getBean("zwhUserMapperImpl2", ZwhUserDao.class);
        for (ZwhUser zwhUser : h.getZwhUserList()) {
            System.out.println(zwhUser);
        }
    }
    @Test
    public void test4() {
        ApplicationContext context =new AnnotationConfigApplicationContext(SpringConfig.class);

        ZwhUserDao h= context.getBean("zwhUserMapperImpl2", ZwhUserDao.class);
        for (ZwhUser zwhUser : h.getZwhUserList()) {
            System.out.println(zwhUser);
        }
    }
    @Test
    public void test5() {
        ApplicationContext context =new AnnotationConfigApplicationContext(SpringConfig.class);

        ZwhUserDao h= context.getBean("zwhUserMapperImpl3", ZwhUserDao.class);
        for (ZwhUser zwhUser : h.getZwhUserList()) {
            System.out.println(zwhUser);
        }
    }
}
