package Design.Decorator.Pack;

/**
 * @author lirui
 * @ClassName:
 * @Description:
 * @date 2019/4/24 16:14
 */
public class HeadsetPack extends Decorator {
    @Override
    public void toPack() {
        super.toPack();
        System.out.println("将耳机放入书包");
    }
}
