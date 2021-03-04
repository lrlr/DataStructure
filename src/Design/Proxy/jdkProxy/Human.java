package Design.Proxy.jdkProxy;

/**
 * @author lirui
 * @ClassName:
 * @Description:
 * @date 2019/4/18 9:25
 */
public class Human implements Person {
    @Override
    public void work() {
        System.out.println("我在工作");
    }
}
