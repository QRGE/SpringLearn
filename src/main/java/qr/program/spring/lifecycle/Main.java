package qr.program.spring.lifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Person person = context.getBean("person", Person.class);
        person.work();
        context.destroy();
    }
}
