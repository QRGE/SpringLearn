package qr.program.spring.aop.proxy;

import qr.program.spring.aop.service.impl.Teacher;

/**
 * @Author qr
 * @Date 2022/5/12-21:54
 */
public class CGLIBProxyTest {

    public static void main(String[] args) {
        Teacher proxyTeacher = new CGLIBProxy<>(new Teacher()).getProxy();
        proxyTeacher.sing();
    }
}
