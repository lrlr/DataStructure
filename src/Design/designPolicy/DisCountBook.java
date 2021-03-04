package Design.designPolicy;

/**
 * @author lirui
 * @ClassName:
 * @Description:
 * @date 2019/4/21 13:16
 */
public class DisCountBook extends Book {
    public DisCountBook(String name, String author, int price) {
        super(name, author, price);
    }

    @Override
    public int price() {
        int price = super.price();//原价
        int disCountPrice = 0;
        if (price >= 50) {
            disCountPrice = price * 80 / 100;
        } else {
            disCountPrice = price * 90 / 100;
        }
        return disCountPrice;
    }
}
