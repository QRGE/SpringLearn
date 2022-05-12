package qr.program.spring.aop.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author qr
 * @Date 2022/5/12-21:29
 */
public class CGLIBProxy<T> implements MethodInterceptor {

    private final T target;

    public CGLIBProxy(T target) {
        this.target = target;
    }

    @SuppressWarnings("unchecked")
    public T getProxy() {
        return (T) Enhancer.create(this.target.getClass(), this);
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("----------CGLIBProxyStart----------");
        Object result = methodProxy.invokeSuper(o, objects);
        System.out.println("----------CGLIBProxyEnd------------");
        return result;
    }
}
