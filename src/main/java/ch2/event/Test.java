package ch2.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 测试类
 *
 * @author liaoxiaoxia
 * @version 1.0.0
 * @date 2019/6/4 11:21
 * @since JDK 1.8
 */
public class Test {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);

        DemoPublisher demoPublisher = context.getBean(DemoPublisher.class);
        demoPublisher.publish("hello");

        context.close();
    }
}
