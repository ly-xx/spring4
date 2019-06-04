package ch2.prepost;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author liaoxiaoxia
 * @version 1.0.0
 * @date 2019/6/4 11:01
 * @since JDK 1.8
 */
@Configuration
@ComponentScan("ch2.prepost")
public class PrePostConfig {

    @Bean(initMethod = "init", destroyMethod = "destroy")
    BeanWayService beanWayService() {
        return new BeanWayService();
    }

    @Bean
    Jsr250WayService jsr250WayService() {
        return new Jsr250WayService();
    }
}
