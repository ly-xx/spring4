package ch2.event;

import org.springframework.context.ApplicationEvent;

/**
 * 注册为事件
 *
 * @author liaoxiaoxia
 * @version 1.0.0
 * @date 2019/6/4 11:15
 * @since JDK 1.8
 */
public class DemoEvent extends ApplicationEvent {

    private String msg;

    public DemoEvent(Object source, String msg) {
        super(source);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
