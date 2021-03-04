package Design.designPolicy;

/**
 * @author lirui
 * @ClassName:
 * @Description:
 * @date 2019/4/19 0:28
 */
public class Book implements IBook {
    private int price;
    private String name;
    private String author;

    public Book(String name, String author, int price) {
        this.author = author;
        this.name = name;
        this.price = price;
    }

    @Override
    public int price() {
        return this.price;
    }

    @Override
    public String name() {
        return this.name;
    }

    @Override
    public String author() {
        return this.author;
    }
}
