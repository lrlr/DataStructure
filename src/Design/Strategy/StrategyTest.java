package Design.Strategy;

/**
 * @author lirui
 * @ClassName:
 * @Description:
 * @date 2019/5/23 19:21
 */
public class StrategyTest {
    public static void main(String[] args) {
        ConcreteStrategyA concreteStrategyA=new ConcreteStrategyA();
        Context context=new Context(concreteStrategyA);
        context.contextInterface();
    }
}
