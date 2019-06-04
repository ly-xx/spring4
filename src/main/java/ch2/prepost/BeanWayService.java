package ch2.prepost;

/**
 * @author liaoxiaoxia
 * @version 1.0.0
 * @date 2019/6/4 10:54
 * @since JDK 1.8
 */
public class BeanWayService {

    public void init(){
        System.out.println("@Bean-init-method");
    }

    public BeanWayService(){
        super();
        System.out.println("初始化构造函数-beanWayService");
    }

    public void destroy(){
        System.out.println("@Bean-destroy-method");
    }
}
