package dataLinkedList;

/**
 * Created by 63024 on 2018/11/2.
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
//        list.addFirst(2);
        list.add(0,3);
        list.add(1,4);
        System.out.println(list.toString());
    }
}
