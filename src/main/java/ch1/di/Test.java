package ch1.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 测试依赖注入（DI）
 *
 * @author liaoxiaoxia
 * @version 1.0.0
 * @date 2019/5/29 9:57
 * @since JDK 1.8
 */
public class Test {

    public static void main(String[] args) {

        // 使用AnnotationConfigApplicationContext作为spring容器，并传入配置类
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(DiConfig.class);

        // 从容器中获取声明的UseFunctionService
        UseFunctionService useFunctionService = applicationContext.getBean(UseFunctionService.class);

        System.out.println(useFunctionService.sayHello("DI"));

        applicationContext.close();
    }
}
