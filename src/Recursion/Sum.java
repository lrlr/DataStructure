package Recursion;
/*
* 递归求和
* */
/**
 * Created by lirui on 2018/11/25.
 */
public class Sum {

    public static int sum(int [] a,int j){
        if (j==a.length){
            return 0;
        }
        return a[j]+sum(a,j+1);
    }

    public static void main(String[] args) {
        int [] a={1,2,3};
        System.out.println(sum(a,1));
    }
}
