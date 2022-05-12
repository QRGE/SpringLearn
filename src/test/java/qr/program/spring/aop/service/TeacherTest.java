package qr.program.spring.aop.service;

import org.junit.jupiter.api.Test;
import qr.program.spring.aop.service.impl.Teacher;
import qr.program.spring.aop.service.impl.TeacherProxy;

/**
 * @Author qr
 * @Date 2022/5/12-20:35
 */
public class TeacherTest {

    @Test
    public void teacherTest() {
        ITeacher proxyTeacher = new TeacherProxy(new Teacher());
        proxyTeacher.teach();
    }
}
