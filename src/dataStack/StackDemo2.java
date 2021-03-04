package dataStack;

/**
 * Created by 63024 on 2018/10/26.
 */
public class StackDemo2 {
    public static int fbi(int i){
        if (i<2){
            return i==0?0:1;
        }
        return fbi(i-1)+fbi(i-2);
    }
    public static void main(String[] args) {
//       int i=0;
       for (int i=0;i<40;i++){
           int fbi = fbi(i);
           System.out.println(fbi);
       }
    }
}
