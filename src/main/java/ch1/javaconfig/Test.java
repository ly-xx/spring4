package ch1.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 测试Java配置
 *
 * @author liaoxiaoxia
 * @version 1.0.0
 * @date 2019/5/29 10:08
 * @since JDK 1.8
 */
public class Test {

    public static void main(String[] args) {
        // 使用AnnotationConfigApplicationContext作为spring容器，并传入配置类
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(JavaConfig.class);

        // 从容器中获取声明的UseFunctionService
        UseFunctionService useFunctionService = applicationContext.getBean(UseFunctionService.class);

        System.out.println(useFunctionService.sayHello("JavaConfig"));

        applicationContext.close();
    }
}
