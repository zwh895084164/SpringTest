import com.wz.annotation.MyAnnotation;
import com.wz.annotation.MyAnnotation1;
import org.junit.Test;

public class TestAnnotation {
    @Test
    public void testAnnotation() {

    }
    //参数如果没有默认值则必须赋值
    @MyAnnotation(name="qwe")
    public  void test() {}

    @MyAnnotation1("123")
    public void test1() {

    }

}
