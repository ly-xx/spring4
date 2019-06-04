package ch2.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 事件监听器
 *
 * @author liaoxiaoxia
 * @version 1.0.0
 * @date 2019/6/4 11:17
 * @since JDK 1.8
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {
    @Override
    public void onApplicationEvent(DemoEvent demoEvent) {
        String msg = demoEvent.getMsg();

        System.out.println("接收消息：" + msg);
    }
}
