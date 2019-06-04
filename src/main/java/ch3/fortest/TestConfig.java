package ch3.fortest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * 声明配置类信息
 *
 * @author liaoxiaoxia
 * @version 1.0.0
 * @date 2019/6/4 14:33
 * @since JDK 1.8
 */
@Configuration
public class TestConfig {

    @Bean
    @Profile("dev")
    public TestBean devTestBean() {
        return new TestBean("from dev");
    }

    @Bean
    @Profile("prod")
    public TestBean prodTestBean() {
        return new TestBean("from prod");
    }
}
