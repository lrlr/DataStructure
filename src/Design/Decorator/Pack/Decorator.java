package Design.Decorator.Pack;

/**
 * @author lirui
 * @ClassName:
 * @Description:
 * @date 2019/4/24 15:30
 */
public  class Decorator extends Pack {
    Pack pack;

    public void setPack(Pack pack) {
        this.pack = pack;
    }

    @Override
    public  void toPack() {
        if (pack != null) {
            pack.toPack();
        }
    }
}
