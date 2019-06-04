package ch3.taskscheduler;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author liaoxiaoxia
 * @version 1.0.0
 * @date 2019/6/4 13:47
 * @since JDK 1.8
 */
@Configuration
@ComponentScan("ch3.taskscheduler")
@EnableScheduling // 开启任务支持
public class TaskSchedulerConfig {


}
