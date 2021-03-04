package Design.constructor.Person;

/**
 * @author lirui
 * @ClassName:
 * @Description:
 * @date 2019/4/18 10:13
 */
public class QiRuiBuilder implements CarBuilder {
    Car car=new Car();
    @Override
    public void buildeTread() {
        car.setTread("奇瑞轮胎");
    }

    @Override
    public void buildeEngine() {
       car.setEngine("奇瑞发动机");
    }

    @Override
    public void buildeChairs() {
      car.setChairs("奇瑞座椅");
    }

    @Override
    public void buildelight() {
  car.setLight("奇瑞大灯");
    }

    @Override
    public Car makeCar() {
        return car;
    }
}
