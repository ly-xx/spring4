package ch2.el;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * EL测试
 *
 * @author liaoxiaoxia
 * @version 1.0.0
 * @date 2019/6/4 10:25
 * @since JDK 1.8
 */
public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ElConfig.class);
        ElConfig config = context.getBean(ElConfig.class);
        config.outputResource();
    }
}
