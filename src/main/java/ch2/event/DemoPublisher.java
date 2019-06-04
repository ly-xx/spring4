package ch2.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * 事件发布类
 *
 * @author liaoxiaoxia
 * @version 1.0.0
 * @date 2019/6/4 11:18
 * @since JDK 1.8
 */
@Component
public class DemoPublisher {

    /**
     * 用于发布事件
     */
    @Autowired
    private ApplicationContext context;

    public void publish(String msg) {
        // 使用publishEvent方法发布事件
        context.publishEvent(new DemoEvent(this, msg));
    }
}
