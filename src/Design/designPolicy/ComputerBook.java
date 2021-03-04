package Design.designPolicy;

/**
 * @author lirui
 * @ClassName:
 * @Description:
 * @date 2019/4/21 13:41
 */
public class ComputerBook implements IComputerBook {
    private int price;
    private String name;
    private String author;
    private String scope;

    public ComputerBook(String name, String author, int price, String scope) {
        this.author = author;
        this.name = name;
        this.price = price;
        this.scope = scope;
    }

    @Override
    public String getScope() {
        return scope;
    }

    @Override
    public int price() {
        return price;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public String author() {
        return author;
    }
}
