package ch2.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * 多实例
 *
 * @author liaoxiaoxia
 * @version 1.0.0
 * @date 2019/5/29 11:22
 * @since JDK 1.8
 */
@Service
@Scope("prototype") // 每次调用生成一个实例
public class DemoPrototypeService {
}
