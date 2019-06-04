package ch1.aop;

import org.springframework.stereotype.Service;

/**
 * 注解式拦截服务
 *
 * @author liaoxiaoxia
 * @version 1.0.0
 * @date 2019/5/29 10:38
 * @since JDK 1.8
 */
@Service
public class DemoAnnotationService {

    @Action(name = "注解式拦截的add操作")
    public void add() {
    }

    @Action(name = "注解式拦截的update操作")
    public void update() {
    }
}
