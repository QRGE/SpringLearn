package qr.program.spring.aop.service;

import org.springframework.stereotype.Service;
import qr.program.spring.aop.annotation.AutoLog;

/**
 * @Author qr
 * @Date 2022/5/12-17:19
 */
@Service
public class UserService {

    public void serviceA() {
        System.out.println("我是业务A");
    }

    public void serviceB(Integer b) {
        System.out.println("我是方法B: " + b);
    }

    @AutoLog(flag = false, value = "你好哇")
    public String serviceC(String c) {
        System.out.println("----------原方法执行开始----------");
        System.out.println("我是方法C: " + c);
        System.out.println("----------原方法执行结束----------");
        return "你好哇";
    }

    public void serviceD() {
        throw new RuntimeException("我错了");
    }
}
