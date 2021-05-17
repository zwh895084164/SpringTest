package Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
//开启AspectJ 自动代理模式,如果不填proxyTargetClass=true，默认为false，
//替换xml配置文件
//@EnableAspectJAutoProxy(proxyTargetClass=true)
@ComponentScan(basePackages = {"service","aop"})
public class SpringConfig {
}
