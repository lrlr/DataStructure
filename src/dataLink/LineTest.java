package dataLink;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 63024 on 2018/10/19.
 */
public class LineTest {
    public static void main(String[] args) {
        List<String> list1=new ArrayList<>();
        List<String> list2=new ArrayList<>();
        String s=new String("12");
        s.toCharArray();
        list1.add("1");
        list1.add("2");
        list1.add("3");
        list2.add("1");
        list2.add("2");
        list2.add("3");
        list2.add("4");
        list2.add("5");
        for (int i=0;i<list2.size();i++){
        if (!list1.contains(list2.get(i))){
            list1.add(list2.get(i));
        }
        }
        System.out.println(list1.toString());
        int[] a={1,2,3,4};
//        int b=2;
//        int c=0;
//        if (a.length>=b){
//             c=a[b-1];
//        }
//        System.out.println(c);
        int b[]= new int[5];
        for (int i=0;i<a.length;i++){
            if (i<2){
                b[i]=a[i];
            }
            if (i>=2){
                b[i+1]=a[i];
            }

        }
        b[2]=20;
        for (int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }
//        System.out.println(b);
    }
}
