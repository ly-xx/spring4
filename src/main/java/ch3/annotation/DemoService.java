package ch3.annotation;

import org.springframework.stereotype.Service;

/**
 * @author liaoxiaoxia
 * @version 1.0.0
 * @date 2019/6/4 14:19
 * @since JDK 1.8
 */
@Service
public class DemoService {

    public void ouputResult() {
        System.out.println("从组合注解中获取bean");
    }
}
