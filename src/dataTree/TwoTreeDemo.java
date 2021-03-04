package dataTree;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by lirui on 2018/11/28.
 */
public class TwoTreeDemo {
    public static void main(String[] args) {
        Random random=new Random();
        TwoTree<Integer> twoTree=new TwoTree<Integer>();
        int a[]={1,3,2};
        for (int i=0;i<3;i++){
            twoTree.add(a[i]);
        }
        twoTree.removeMin();
      /*  ArrayList<Integer> arrayList=new ArrayList<>();
        while (!twoTree.isEmpty()) {
            Integer min = twoTree.removeMin();
            arrayList.add(min);
        }
        System.out.println(arrayList);
        for (int i=1;i<arrayList.size();i++){
            if (arrayList.get(i-1)>arrayList.get(i)){
                throw new IllegalArgumentException("Error");
            }
            System.out.println("success");
        }*/
    }
}
