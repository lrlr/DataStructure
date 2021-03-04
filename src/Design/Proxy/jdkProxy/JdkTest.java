package Design.Proxy.jdkProxy;

/**
 * @author lirui
 * @ClassName:
 * @Description:
 * @date 2019/4/18 9:31
 */
public class JdkTest {
    public static void main(String[] args) {

      PersonProxy proxy=new PersonProxy();
        Person o = (Person) proxy.newProxy(new Human());
        o.work();
    }
}
