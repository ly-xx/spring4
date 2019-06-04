package ch3.fortest;

/**
 * 测试类
 *
 * @author liaoxiaoxia
 * @version 1.0.0
 * @date 2019/6/4 14:31
 * @since JDK 1.8
 */
public class TestBean {

    public TestBean(String content) {
        super();
        this.content = content;
    }

    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
