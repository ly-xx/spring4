package ch1.javaconfig;

import org.springframework.context.annotation.Bean;

/**
 * Java配置类
 *
 * @author liaoxiaoxia
 * @version 1.0.0
 * @date 2019/5/29 10:05
 * @since JDK 1.8
 */
public class JavaConfig {

    @Bean
    public FunctionService functionService() {
        return new FunctionService();
    }

    @Bean
    public UseFunctionService useFunctionService() {
        UseFunctionService useFunctionService = new UseFunctionService();
        useFunctionService.setFunctionService(functionService());
        return useFunctionService;
    }
}
