package ch1.aop;

import java.lang.annotation.*;

/**
 * 定义切面拦截注解
 *
 * @author liaoxiaoxia
 * @version 1.0.0
 * @date 2019/5/29 10:34
 * @since JDK 1.8
 */
@Target(ElementType.METHOD) // 定义注解目标为方法
@Retention(RetentionPolicy.RUNTIME) // 定义注解保留策略，注解会在class字节码文件中存在，在运行时可以通过反射获取到
@Documented
public @interface Action {

    String name();
}
