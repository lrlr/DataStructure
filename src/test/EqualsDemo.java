package test;

/**
 * Created by lirui on 2018/12/12.
 */
public class EqualsDemo {
    public static void main(String[] args) {
        ObjectTest1 objectTest1 = new ObjectTest1();
        objectTest1.setName("wahaha");
        ObjectTestChild child1 = new ObjectTestChild("wahaha", "123");
        ObjectTestChild child2 = new ObjectTestChild("wahaha", "456");
        System.out.println("-=-=-=--=-=-=-=-=运行结果-=-=-=-=-=-=-=-=");
        System.out.println(objectTest1.equals(child1));
        System.out.println(objectTest1.equals(child2));
        System.out.println(child1.equals(child2));
    }
}
