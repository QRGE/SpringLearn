package qr.program.spring.aop.service;

import org.junit.jupiter.api.Test;
import qr.program.spring.aop.proxy.CGLIBProxy;
import qr.program.spring.aop.proxy.JavaProxy;
import qr.program.spring.aop.service.impl.Teacher;

/**
 * @Author qr
 * @Date 2022/5/12-20:49
 */
public class ProxyTest {

    @Test
    public void javaProxyTest() {
        ITeacher proxyTeacher = (ITeacher) new JavaProxy(new Teacher()).getProxy();
        proxyTeacher.teach();
    }

    @Test
    public void cglibProxyTest() {
        Teacher proxyTeacher = new CGLIBProxy<>(new Teacher()).getProxy();
        proxyTeacher.sing();
    }
}
