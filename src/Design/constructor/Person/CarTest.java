package Design.constructor.Person;

/**
 * @author lirui
 * @ClassName:
 * @Description:
 * @date 2019/4/18 14:17
 */
public class CarTest {
    public static void main(String[] args) {
        Commander commander = new Commander();
        Car car = commander.getCar(new FutureBuilder());
        System.out.println(car.getChairs());
    }
}
