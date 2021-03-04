package arithmetic.InsertSort;

/**
 * Created by lirui on 2018/12/29.
 */
public class InsertSortTest {
    public static void sort(Comparable[] arr){
     for (int i=0;i<arr.length;i++){
         for (int j=i;j>0&&arr[j].compareTo(arr[j-1])<0;j--){
             if (arr[j].compareTo(arr[j-1])<0){
                swap(arr,j,j-1);
             }
         }
     }

    }
    public static void swap(Object[] arr,int i,int j){
           Object s=arr[i];
           arr[i]=arr[j];
           arr[j]=s;
    }
    public static void main(String[] args) {
        Integer[] a={9,7,3,2,9,0,7,3,2,9};
        sort(a);
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
