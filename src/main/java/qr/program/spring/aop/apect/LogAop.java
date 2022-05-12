package qr.program.spring.aop.apect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @Author qr
 * @Date 2022/5/12-17:32
 */
@Aspect
@Component // 注意这个
public class LogAop {

    @Pointcut("execution(* qr.program.spring.aop.service..*.*(..))")
    public void pointCut(){};

    /**
     * before 表示方法执行之前，
     */
    @Before("pointCut()")
    public void before(JoinPoint joinPoint) {
        String className = joinPoint.getTarget().getClass().getName();
        // signature() 方法签名
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        String methodName = signature.getName();
        String[] parameterNames = signature.getParameterNames();
        Object[] args = joinPoint.getArgs();
        System.out.println("----------BeforeStart----------");
        System.out.println("当前执行类：" + className);
        System.out.println("当前执行方法：" + methodName);
        System.out.println("参数名列表：" + Arrays.toString(parameterNames));
        System.out.println("参数值值列表：" + Arrays.toString(args));
        System.out.println("----------BeforeEnd------------");
    }

    @After("pointCut()")
    public void after() {
        System.out.println("----------AfterStart----------");
        System.out.println("---------- 结束日志记录");
        System.out.println("----------AfterEnd------------");
    }

    /**
     * returning 可以设置返回值参数名
     */
    @AfterReturning(pointcut = "pointCut()", returning = "rs")
    public void afterReturn(Object rs) {
        System.out.println("----------AfterReturningStart----------");
        System.out.println("方法的返回值: " + rs);
        System.out.println("----------AfterReturningEnd------------");
    }

    @AfterThrowing(pointcut = "pointCut()", throwing = "e")
    public void afterThrow(Throwable e) {
        System.out.println("----------AfterThrowStart----------");
        System.out.println(e);
        System.out.println("----------AfterThrowEnd------------");
    }

    @Around("pointCut()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("----------AroundStart----------");
        Object result = pjp.proceed();
        System.out.println("----------AroundENd------------");
        return result;
    }
}
