package Map;

import java.util.ArrayList;
import java.util.TreeMap;

/**
 * 实现查找两个数组中相同元素，重复元素不过滤
 * Created by lirui on 2018/12/6.
 */
public class Solution {
    public int[] interset(int[] a,int[] b){
        TreeMap<Integer,Integer> treeMap=new TreeMap<>();
        for (int i:a){
            if (treeMap.containsKey(i)){
                treeMap.put(i,treeMap.get(i)+1);
            }else{
                treeMap.put(i,1);
            }
        }
        ArrayList<Integer> arrayList=new ArrayList<>();
        for (int i:b){
            if (treeMap.containsKey(i)){
                arrayList.add(i);
                treeMap.put(i,treeMap.get(i)-1);
                if (treeMap.get(i)==0){
                    treeMap.remove(i);
                }
            }
        }
        int[] c=new int[arrayList.size()];
        for (int i=0;i<arrayList.size();i++){
            c[i]=arrayList.get(i);
        }
        return c;
    }

    public static void main(String[] args) {
        int a[]={1,2,3,4,3,5,6,6};
        int b[]={1,2,8,9,3,3};
        int[] interset = new Solution().interset(a, b);
        for (int i=0;i<interset.length;i++){
            System.out.println(interset[i]);
        }
    }
}
