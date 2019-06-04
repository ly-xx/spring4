package ch3.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @author liaoxiaoxia
 * @version 1.0.0
 * @date 2019/6/4 14:07
 * @since JDK 1.8
 */
@Configuration
@ComponentScan("ch3.conditional")
public class ConditionConfig {

    /**
     * 注解@Conditional，符合WindowsCondition条件则实例化WindowsListService
     *
     * @return WindowsListService
     */
    @Bean
    @Conditional(WindowsCondition.class)
    public WindowsListService windowsListService() {
        return new WindowsListService();
    }

    /**
     * 注解@Conditional，符合LinuxCondition条件则实例化LinuxListService
     *
     * @return LinuxListService
     */
    @Bean
    @Conditional(LinuxCondition.class)
    public LinuxListService linuxListService() {
        return new LinuxListService();
    }
}
