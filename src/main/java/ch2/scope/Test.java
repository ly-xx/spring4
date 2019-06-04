package ch2.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 测试
 *
 * @author liaoxiaoxia
 * @version 1.0.0
 * @date 2019/5/29 11:23
 * @since JDK 1.8
 */
public class Test {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);

        DemoSingletonService singletonService1 = context.getBean(DemoSingletonService.class);
        DemoSingletonService singletonService2 = context.getBean(DemoSingletonService.class);

        DemoPrototypeService prototypeService1 = context.getBean(DemoPrototypeService.class);
        DemoPrototypeService prototypeService2 = context.getBean(DemoPrototypeService.class);

        System.out.println(singletonService1.equals(singletonService2));
        System.out.println(prototypeService1.equals(prototypeService2));
    }
}
