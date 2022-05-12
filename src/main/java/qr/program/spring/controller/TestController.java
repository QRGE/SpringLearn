package qr.program.spring.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import qr.program.spring.bean.Operator;

/**
 * @Author qr
 * @Date 2022/5/11-20:45
 */
@RestController
@RequestMapping("/test")
@Slf4j
public class TestController {

    @Autowired
    private Operator operator;

    @GetMapping("/test")
    public String get(){
        Operator operator = new Operator(1, "Amiya");
        log.info("创建的 Operator 对象: {}", operator);
        return operator.toString();
    }
}
