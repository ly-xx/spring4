package ch1.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 使用功能类
 *
 * @author liaoxiaoxia
 * @version 1.0.0
 * @date 2019/5/29 9:48
 * @since JDK 1.8
 */
@Service // 使用@Service声明UseFunctionService是spring管理的类
public class UseFunctionService {

    /**
     * 将functionService注入到UseFunctionService,
     * 也可用JSR-330的@Inject注解和JSR-225的@Resource注解替换@Autowired
     */
    @Autowired
    private FunctionService functionService;

    public String sayHello(String word) {
        return functionService.sayHello(word);
    }

}
