package ch1.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * 定义切面
 *
 * @author liaoxiaoxia
 * @version 1.0.0
 * @date 2019/5/29 10:43
 * @since JDK 1.8
 */
@Aspect // 声明切面
@Component // 声明为bean交给spring管理
public class LogAspect {

    /**
     * 声明切点
     */
    @Pointcut("@annotation(ch1.aop.Action)")
    public void annotationPointCut() {
    }

    /**
     * 声明建言，并使用切入点
     *
     * @param joinPoint 切入点信息
     */
    @After("annotationPointCut()")
    public void after(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        Action action = method.getAnnotation(Action.class);
        System.out.println("注解式拦截：" + action.name());
    }

    @Before("execution(* ch1.aop.DemoMethodService.*(..))")
    public void before(JoinPoint joinPoint){
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Method method = methodSignature.getMethod();

        System.out.println("方法式拦截："+method.getName());
    }

}
