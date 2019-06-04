package ch2.prepost;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author liaoxiaoxia
 * @version 1.0.0
 * @date 2019/6/4 10:57
 * @since JDK 1.8
 */
public class Jsr250WayService {

    /**
     * 在构造函数完成后执行
     */
    @PostConstruct
    public void init() {
        System.out.println("@jsr250-init-method");
    }

    public Jsr250WayService() {
        super();
        System.out.println("初始化构造函数-jsr250WayService");
    }

    /**
     * 在bean销毁前执行
     */
    @PreDestroy
    public void destroy() {
        System.out.println("@jsr250-destroy-method");
    }
}
