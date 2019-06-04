package ch1.di;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 声明配置类
 *
 * @author liaoxiaoxia
 * @version 1.0.0
 * @date 2019/5/29 9:54
 * @since JDK 1.8
 */
@Configuration // 声明当前类是一个配置类
@ComponentScan("ch1.di") // 使用ComponentScan自动扫描ch1.di包下所有使用@Service等的类，并注册为bean
public class DiConfig {


}
