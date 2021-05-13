import com.wz.proxy.Host;
import com.wz.proxy.ProxyInvocation;
import com.wz.proxy.Rent;
import org.junit.Test;

public class TestProxy {
    @Test
    public void testProxy() {
        Host host=new Host();
        ProxyInvocation proxyInvocation =new ProxyInvocation();
        proxyInvocation.setRent(host);

        Rent rent=(Rent)proxyInvocation.getProxy();
        rent.rent();
    }
}
