package ch1.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * aop配置类
 *
 * @author liaoxiaoxia
 * @version 1.0.0
 * @date 2019/5/29 10:52
 * @since JDK 1.8
 */
@Configuration
@ComponentScan("ch1.aop")
@EnableAspectJAutoProxy // 开启spring对aspectj的支持
public class AopConfig {
}
