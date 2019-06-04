package ch3.taskscheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 定时任务执行类
 *
 * @author liaoxiaoxia
 * @version 1.0.0
 * @date 2019/6/4 13:49
 * @since JDK 1.8
 */
@Service
public class ScheduledService {

    private static SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedDelay = 5000)
    public void repeat() {
        System.out.println("每5秒执行一次:" + format.format(new Date()));
    }

    @Scheduled(cron = "0 55 13 * * *")
    public void fix() {
        System.out.println("定时执行:" + format.format(new Date()));
    }
}
