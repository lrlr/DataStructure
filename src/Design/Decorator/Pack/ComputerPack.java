package Design.Decorator.Pack;

/**
 * @author lirui
 * @ClassName:
 * @Description:
 * @date 2019/4/24 15:50
 */
public class ComputerPack extends Decorator {
    @Override
    public void toPack() {
        super.toPack();
        System.out.println("将电脑放入书包");
    }
}
