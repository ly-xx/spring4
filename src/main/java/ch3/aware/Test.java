package ch3.aware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author liaoxiaoxia
 * @version 1.0.0
 * @date 2019/6/4 11:52
 * @since JDK 1.8
 */
public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AwareConfig.class);

        AwareService awareService = context.getBean(AwareService.class);

        awareService.output();

        context.close();
    }
}
