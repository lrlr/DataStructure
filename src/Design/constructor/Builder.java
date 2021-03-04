package Design.constructor;

/**
 * @author lirui
 * @ClassName:
 * @Description:
 * @date 2019/4/17 20:37
 */
public abstract class Builder {
    public abstract void builde(String name);
//    public abstract void buildeResource(String resource);
//    public abstract void buildeColor(String color);
//    public abstract void buildePrice(String price);
    public abstract Product makeProduct();

}
