package Design.Decorator;

/**
 * @author lirui
 * @ClassName:
 * @Description:
 * @date 2019/4/24 14:10
 */
public class DecoraterTest {
    public static void main(String[] args) {
        ConcerteComponent c=new ConcerteComponent();
        ConcretDecoratorA a=new ConcretDecoratorA();
        ConcretDecoratorB b=new ConcretDecoratorB();
        a.setComponent(c);
        b.setComponent(a);
      b.operation();
    }
}
