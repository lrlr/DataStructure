package Design.constructor.Person;

/**
 * @author lirui
 * @ClassName:
 * @Description:
 * @date 2019/4/18 10:18
 */
public class FutureBuilder implements CarBuilder {
    Car car = new Car();

    @Override
    public void buildeTread() {
        car.setLight("蔚来轮胎");
    }

    @Override
    public void buildeEngine() {
        car.setEngine("蔚来发动机");
    }

    @Override
    public void buildeChairs() {
        car.setChairs("蔚来汽车座位");
    }

    @Override
    public void buildelight() {
        car.setLight("蔚来灯");
    }

    @Override
    public Car makeCar() {
        return car;
    }
}
