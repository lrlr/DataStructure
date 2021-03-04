package Design.designPolicy;

import java.util.ArrayList;

/**
 * @author lirui
 * @ClassName:
 * @Description:
 * @date 2019/4/19 0:30
 */
public class Sell {
    private final static ArrayList<IBook> bookList = new ArrayList<>();

    static {
        bookList.add(new DisCountBook("三国演义", "罗贯中", 100));
        bookList.add(new DisCountBook("西游记", "吴承恩", 200));
        bookList.add(new DisCountBook("红楼梦", "曹雪芹", 300));
        bookList.add(new ComputerBook("深入理解Java虚拟机:JVM高级特性与最佳实践", "周志明", 400, "程序员"));

    }

    public static void main(String[] args) {
        for (IBook book : bookList) {
            System.out.println("书籍名称：" + book.name() + "\t书籍作者：" + book.author() + "\t书籍价格:" + book.price() + "元");
        }
    }
}
