package Design.TemplateMethod;

/**
 * @author lirui
 * @ClassName:
 * @Description:
 * @date 2019/5/13 18:58
 */
public abstract class AbstractClass {
    public abstract void primitiveOperation1();
    public abstract void primitiveOperation2();
    public void templateMethod(){
        primitiveOperation1();
        primitiveOperation2();
        System.out.println("finish");
    }
}
