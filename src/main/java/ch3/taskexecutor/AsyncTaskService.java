package ch3.taskexecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @author liaoxiaoxia
 * @version 1.0.0
 * @date 2019/6/4 13:36
 * @since JDK 1.8
 */
@Service
public class AsyncTaskService {

    /**
     * 注解@Async声明该方法为异步方法，如果声明在类上，说明该类全部方法都为异步方法
     *
     * @param i
     */
    @Async
    public void executorAsyncTask(Integer i) {
        System.out.println("执行异步任务：" + i);
    }

    @Async
    public void executorAsyncTaskPlus(Integer i) {
        System.out.println("执行异步任务+1：" + (i + 1));
    }
}
