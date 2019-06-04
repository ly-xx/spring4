package ch3.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.lang.annotation.*;

/**
 * 组合注解
 *
 * @author liaoxiaoxia
 * @version 1.0.0
 * @date 2019/6/4 14:16
 * @since JDK 1.8
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Configuration
@ComponentScan
public @interface WiselyConfiguration {

    /**
     * 覆盖value参数
     *
     * @return
     */
    String[] value() default {};
}
