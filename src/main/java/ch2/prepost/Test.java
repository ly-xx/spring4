package ch2.prepost;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author liaoxiaoxia
 * @version 1.0.0
 * @date 2019/6/4 11:03
 * @since JDK 1.8
 */
public class Test {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PrePostConfig.class);

        BeanWayService beanWayService = context.getBean(BeanWayService.class);
        Jsr250WayService jsr250WayService = context.getBean(Jsr250WayService.class);

        context.close();
    }
}
