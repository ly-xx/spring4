package ch1.di;

import org.springframework.stereotype.Service;

/**
 * 第一章节：依赖注入DI
 * 声明功能类
 *
 * @author liaoxiaoxia
 * @version 1.0.0
 * @date 2019/5/28 17:05
 * @since JDK 1.8
 */
@Service // 使用@Service声明FunctionService是spring管理的类
public class FunctionService {

    public String sayHello(String word) {
        return "Hello " + word + " !";
    }
}
