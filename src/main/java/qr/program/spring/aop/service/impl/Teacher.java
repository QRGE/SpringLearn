package qr.program.spring.aop.service.impl;

import qr.program.spring.aop.service.ITeacher;

/**
 * @Author qr
 * @Date 2022/5/12-20:27
 */
public class Teacher implements ITeacher {

    @Override
    public String teach() {
        System.out.println("老师正在教书。。。");
        return "张老师";
    }
}
