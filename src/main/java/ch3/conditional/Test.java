package ch3.conditional;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author liaoxiaoxia
 * @version 1.0.0
 * @date 2019/6/4 14:09
 * @since JDK 1.8
 */
public class Test {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConditionConfig.class);

        ListService listService = context.getBean(ListService.class);
        System.out.println(context.getEnvironment().getProperty("os.name")+" 列表命令："+listService.showListCmd());

        context.close();
    }
}
