package Design.TemplateMethod;

/**
 * @author lirui
 * @ClassName:
 * @Description:
 * @date 2019/5/13 19:06
 */
public class TemplateTest {
    public static void main(String[] args) {
        AbstractClass abstractClass= new ConcreteClass();
        abstractClass.templateMethod();
    }
}
