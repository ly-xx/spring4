package ch1.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author liaoxiaoxia
 * @version 1.0.0
 * @date 2019/5/29 10:53
 * @since JDK 1.8
 */
public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);

        DemoAnnotationService annotationService = context.getBean(DemoAnnotationService.class);
        DemoMethodService methodService = context.getBean(DemoMethodService.class);

        annotationService.add();
        annotationService.update();
        methodService.add();
        methodService.update();
        context.close();
    }
}
