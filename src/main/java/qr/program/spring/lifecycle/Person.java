package qr.program.spring.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

/**
 * @Author qr
 * @Date 2022/5/14-21:15
 */
public class Person implements InitializingBean, BeanFactoryAware, BeanNameAware, DisposableBean {

    private Integer id;

    private String name;

    public Person() {
        System.out.println("1.A Person is created");
    }

    public void setId(Integer id) {
        this.id = id;
        System.out.println("2.1 Person setId: " + id);
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("2.2 Person setName: " + name);
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("3.BeanNameAware.setBeanName方法: 我要上学了，起了个学名: " + s);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("4.BeanFactoryAware.setBeanFactory方法：选好学校了");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("6.InitializingBean#afterPropertiesSet方法：入学登记");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("9.DisposableBean#destroy方法：平淡的一生落幕了");
    }

    public void destroyMethod() {
        System.out.println("10.自定义destroy方法: 寄了");
    }

    public void init() {
        System.out.println("7.自定义init方法：努力上学ing");
    }

    public void work(){
        System.out.println("Bean使用中：工作，只有对社会没有用的人才放假。。");
    }

}
