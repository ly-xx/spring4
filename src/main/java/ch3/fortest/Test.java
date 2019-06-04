package ch3.fortest;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author liaoxiaoxia
 * @version 1.0.0
 * @date 2019/6/4 14:35
 * @since JDK 1.8
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestConfig.class) // 加载配置ApplicationContext，classes加载配置类
@ActiveProfiles("dev")
public class Test {

    @Autowired
    private TestBean testBean;

    @org.junit.Test
    public void devBean() {
        String msg = "from dev";
        String actual = testBean.getContent();
        Assert.assertEquals(msg, actual);
    }
}
