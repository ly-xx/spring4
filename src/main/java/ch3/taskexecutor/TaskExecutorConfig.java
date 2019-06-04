package ch3.taskexecutor;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * 配置类
 * @author liaoxiaoxia
 * @version 1.0.0
 * @date 2019/6/4 12:00
 * @since JDK 1.8
 */
@Configuration
@ComponentScan("ch3.taskexecutor")
@EnableAsync // 开启异步任务支持
public class TaskExecutorConfig implements AsyncConfigurer{


    @Override
    public Executor getAsyncExecutor() {
        // 从线程池获取线程信息
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(5);
        executor.setMaxPoolSize(10);
        executor.setQueueCapacity(25);
        executor.initialize();
        return executor;
    }

    @Override
    public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
        return null;
    }
}
