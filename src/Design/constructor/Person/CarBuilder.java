package Design.constructor.Person;

/**
 * @author lirui
 * @ClassName:
 * @Description:
 * @date 2019/4/18 10:06
 */
public interface CarBuilder {
    public void buildeTread();
    public void buildeEngine();
    public void buildeChairs();
    public void buildelight();
    public Car makeCar();
}
