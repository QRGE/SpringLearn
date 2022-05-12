package qr.program.spring.aop.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import qr.program.spring.aop.service.UserService;

/**
 * @Author qr
 * @Date 2022/5/12-17:24
 */
@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void serviceATest() {
        userService.serviceA();
    }

    @Test
    public void serviceBTest() {
        userService.serviceB(1);
    }

    @Test
    public void serviceCTest() {
        userService.serviceC("serviceC");
    }

    @Test
    public void serviceDTest() {
        userService.serviceD();
    }
}
