package ch3.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 测试
 *
 * @author liaoxiaoxia
 * @version 1.0.0
 * @date 2019/6/4 14:21
 * @since JDK 1.8
 */
public class Test {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

        DemoService demoService = context.getBean(DemoService.class);

        demoService.ouputResult();

        context.close();
    }
}
