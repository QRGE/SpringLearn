package qr.program.spring.aop.proxy;

import qr.program.spring.aop.service.ITeacher;
import qr.program.spring.aop.service.impl.Teacher;

/**
 * @Author qr
 * @Date 2022/5/20-11:43
 */
public class JavaProxyTest {

    public static void main(String[] args) {
        ITeacher teacher = new JavaProxy<>(new Teacher()).getProxy();
        System.out.println(teacher.sing());
    }
}
