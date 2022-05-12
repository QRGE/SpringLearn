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

    @Override
    public String sing() {
        System.out.println("被伤过的心还可以爱谁");
        return "唱歌";
    }

    public void teachEN() {
        System.out.println("教英语");
    }
}
