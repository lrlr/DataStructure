package arithmetic.ShellSort;

/**
 * Created by lirui on 2019/2/28.
 */
public class ShellSortTest {
   public static Comparable[] shllSort(Comparable arr[]){
       if (arr==null||arr.length<2){
           return  arr;
       }
       int n=arr.length;
       for (int h=n/2;h>0;h/=2){
           for (int i=h;i<n;i++){
               insertSort(arr,h,i);
           }
       }
       return arr;
   }

    private static void insertSort(Comparable[] arr,int h,int i){
        Comparable temp=arr[i];
        int k;
        for (k=i-h;k>0&&temp.compareTo(arr[i-h])<0;k=k-h){
         arr[k+h]=arr[h];
        }
       arr[k+h]=temp;
    }
}
