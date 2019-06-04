package ch2.el;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

/**
 * EL 配置类
 *
 * @author liaoxiaoxia
 * @version 1.0.0
 * @date 2019/6/4 10:06
 * @since JDK 1.8
 */
@Configuration
@ComponentScan("ch2.el")
@PropertySource("classpath:test.properties")
public class ElConfig {

    /**
     * 注入普通字符串
     */
    @Value("normal")
    private String normal;

    /**
     * 注入系统属性
     */
    @Value("#{systemProperties['os.name']}")
    private String osName;

    /**
     * 注入表达式结果
     */
    @Value("#{ T(java.lang.Math).random()*100}")
    private double randomNumber;

    /**
     * 注入其他bean属性
     */
    @Value("#{demoService.another}")
    private String fromAnother;

    /**
     * 注入文件资源
     */
    @Value("classpath:test.txt")
    private Resource resource;

    /**
     * 注入网址资源
     */
    @Value("http://www.baidu.com")
    private Resource testUrl;

    /**
     * 注入配置文件属性
     */
    @Value("${book.name}")
    private String bookName;

    /**
     * 注入配置文件
     */
    @Autowired
    private Environment environment;

    /**
     * 注入配置文件需使用@PropertySource指定文件地址，若使用@Value注入，
     * 则需配置PropertySourcesPlaceholderConfigurer的bean
     *
     * @return PropertySourcesPlaceholderConfigurer
     */
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    public void outputResource() {
        try {
            System.out.println(normal);
            System.out.println(osName);
            System.out.println(fromAnother);
            System.out.println(IOUtils.toString(resource.getInputStream()));
            System.out.println(IOUtils.toString(testUrl.getInputStream()));
            System.out.println(bookName);
            System.out.println(environment.getProperty("book.author"));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


