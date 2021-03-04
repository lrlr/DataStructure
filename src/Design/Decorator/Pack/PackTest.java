package Design.Decorator.Pack;

/**
 * @author lirui
 * @ClassName:
 * @Description:
 * @date 2019/4/24 16:14
 */
public class PackTest {
    public static void main(String[] args) {
        ConcertPack concertPack=new ConcertPack();
        CupPack cupPack=new CupPack();
        ComputerPack computerPack=new ComputerPack();
        BookPack bookPack=new BookPack();
        HeadsetPack headsetPack=new HeadsetPack();
        cupPack.setPack(concertPack);
        computerPack.setPack(cupPack);
        bookPack.setPack(computerPack);
        headsetPack.setPack(bookPack);
        headsetPack.toPack();
    }
}
