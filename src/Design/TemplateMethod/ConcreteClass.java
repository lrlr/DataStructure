package Design.TemplateMethod;

/**
 * @author lirui
 * @ClassName:
 * @Description:
 * @date 2019/5/13 19:05
 */
public class ConcreteClass extends AbstractClass {
    @Override
    public void primitiveOperation1() {
        System.out.println("to do one");
    }

    @Override
    public void primitiveOperation2() {
        System.out.println("to do two");
    }
}
