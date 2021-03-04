package dataArray;

/**
 * Created by 63024 on 2018/10/29.
 */
public class ArrayDemo {
    public static void main(String[] args) {
        Array<Integer> array=new Array(20);
        for (int i=0;i<10;i++){
          array.addLast(i);
            System.out.println("123");
            System.out.println("456");
        }

        String s = array.toString();
        //查询指定位置元素
        array.get(2);
        System.out.println(array.get(2));
        //修改指定位置元素
        array.set(2,-1);

        int o =  array.removeFirst();
        System.out.println("clone");
        System.out.println("123");
        System.out.println(array.toString());
    }
}
