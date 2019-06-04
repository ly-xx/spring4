package ch2.el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * EL表达书
 * @author liaoxiaoxia
 * @version 1.0.0
 * @date 2019/5/29 11:28
 * @since JDK 1.8
 */
@Service
public class DemoService {

    @Value("其他类的属性")
    private String another;

    public String getAnother() {
        return another;
    }

    public void setAnother(String another) {
        this.another = another;
    }
}
