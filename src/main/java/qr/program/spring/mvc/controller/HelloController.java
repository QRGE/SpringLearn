package qr.program.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Author qr
 * @Date 2022/5/17-13:59
 */
@Controller
@RequestMapping("hello/")
public class HelloController {

    @RequestMapping("/greet")
    public ModelAndView greet() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("greet", "你好哇");
        return modelAndView;
    }
}
