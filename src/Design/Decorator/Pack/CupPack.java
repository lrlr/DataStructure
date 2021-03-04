package Design.Decorator.Pack;

/**
 * @author lirui
 * @ClassName:
 * @Description:
 * @date 2019/4/24 15:54
 */
public class CupPack extends Decorator {
    @Override
    public void toPack() {
        super.toPack();
        System.out.println("将杯子放入书包");
    }

}
