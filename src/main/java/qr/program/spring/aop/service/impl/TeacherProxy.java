package qr.program.spring.aop.service.impl;

import qr.program.spring.aop.service.ITeacher;

/**
 * @Author qr
 * @Date 2022/5/12-20:28
 */
public class TeacherProxy implements ITeacher {

    private ITeacher teacher;

    public TeacherProxy(ITeacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String teach() {
        System.out.println("-----------TeacherProxyStart--------");
        System.out.println(teacher.teach());
        System.out.println("-----------TeacherProxyEnd----------");
        return null;
    }
}
