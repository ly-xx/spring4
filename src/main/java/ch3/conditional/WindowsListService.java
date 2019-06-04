package ch3.conditional;

/**
 * @author liaoxiaoxia
 * @version 1.0.0
 * @date 2019/6/4 14:06
 * @since JDK 1.8
 */
public class WindowsListService implements ListService {

    @Override
    public String showListCmd() {
        return "dir";
    }
}
