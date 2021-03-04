package Design.constructor.Person;

/**
 * @author lirui
 * @ClassName:
 * @Description:
 * @date 2019/4/18 14:13
 */
public class Commander {
    CarBuilder carBuilder;

    public Car getCar(CarBuilder carBuilder) {
          carBuilder.buildeChairs();
          carBuilder.buildeEngine();
          carBuilder.buildelight();
          carBuilder.buildeTread();
        return carBuilder.makeCar();
    }
}
