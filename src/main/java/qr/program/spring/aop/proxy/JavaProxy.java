package qr.program.spring.aop.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * java 的动态代理通过实现代理类的接口
 * @Author qr
 * @Date 2022/5/12-20:44
 */
public class JavaProxy<T> implements InvocationHandler {

    private final T target;

    public JavaProxy(T target) {
        this.target = target;
    }

    /**
     * 获取代理对象
     */
    @SuppressWarnings("unchecked")
    public T getProxy() {
        return (T)Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                // 通过接口进行代理
                target.getClass().getInterfaces(),
                this
        );
    }

    /**
     * 默认接口中的每个方法都进行代理
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("----------JavaProxyStart----------");
        Object result = method.invoke(this.target, args);
        System.out.println("----------JavaProxyEnd------------");
        return result;
    }
}
