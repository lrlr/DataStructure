package Design.Decorator;

/**
 * @author lirui
 * @ClassName:
 * @Description:
 * @date 2019/4/24 14:06
 */
public class ConcretDecoratorA extends Decorator {
    @Override
    public void operation() {
        super.operation();
        System.out.println("1");
    }

}
