import com.wz.annotation.MyField;
import org.junit.Test;

import java.lang.reflect.Field;

public class MyFieldTest {
    @MyField(desc = "用户名",length = 12)
    private String userName;

    @Test
    public void testMyfield() {
        //获取类模板
        Class c=MyFieldTest.class;
        //获取所有字段
        for(Field f:c.getDeclaredFields()) {
            //判断这个字段是否有MyField注解
            if(f.isAnnotationPresent(MyField.class)) {
                MyField annotation =f.getAnnotation(MyField.class);
                System.out.println("字段："+f.getName()+"描述："+annotation.desc()+"长度："+ annotation.length());
            }
        }
    }

}
