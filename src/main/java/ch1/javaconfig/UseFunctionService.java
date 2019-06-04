package ch1.javaconfig;

/**
 * 使用功能类
 *
 * @author liaoxiaoxia
 * @version 1.0.0
 * @date 2019/5/29 9:48
 * @since JDK 1.8
 */
public class UseFunctionService {

    private FunctionService functionService;

    public void setFunctionService(FunctionService functionService) {
        this.functionService = functionService;
    }

    public String sayHello(String word) {
        return functionService.sayHello(word);
    }

}
