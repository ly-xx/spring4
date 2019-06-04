package ch3.taskexecutor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author liaoxiaoxia
 * @version 1.0.0
 * @date 2019/6/4 13:38
 * @since JDK 1.8
 */
public class Test {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskExecutorConfig.class);

        AsyncTaskService taskService = context.getBean(AsyncTaskService.class);
        for (int i = 0; i < 10; i++) {
            taskService.executorAsyncTask(i);
            taskService.executorAsyncTaskPlus(i);
        }

        context.close();
    }
}
