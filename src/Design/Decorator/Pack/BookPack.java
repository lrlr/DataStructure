package Design.Decorator.Pack;

/**
 * @author lirui
 * @ClassName:
 * @Description:
 * @date 2019/4/24 15:53
 */
public class BookPack extends Decorator {
    @Override
    public void toPack() {
        super.toPack();
        System.out.println("将书放入书包");
    }
}
