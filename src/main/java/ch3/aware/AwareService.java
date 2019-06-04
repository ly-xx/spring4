package ch3.aware;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

/**
 * BeanNameAware 获取容器中bean的名称
 * ResourceLoaderAware 获取资源加载器，可以获取外部资源文件
 *
 * @author liaoxiaoxia
 * @version 1.0.0
 * @date 2019/6/4 11:36
 * @since JDK 1.8
 */
@Service
public class AwareService implements BeanNameAware, ResourceLoaderAware {

    private String beanName;

    private ResourceLoader resourceLoader;

    @Override
    public void setBeanName(String s) {
        this.beanName = s;
    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

    public void output() {
        System.out.println("Bean的名称：" + beanName);

        Resource resource = resourceLoader.getResource("classpath:test.txt");
        try {
            System.out.println("Resource加载文件内容：" + IOUtils.toString(resource.getInputStream()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
