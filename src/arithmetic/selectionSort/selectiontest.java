package arithmetic.selectionSort;

/**
 * Created by lirui on 2018/12/29.
 */
public class selectiontest {
    public static void sort(Comparable[] arr){
        for (int i=0;i<arr.length;i++){
            int min=i;
            for (int j=i+1;j<arr.length;j++){
                if (arr[j].compareTo(arr[min])<0){
                    min=j;
                }
            }
            swap(arr,i,min);
        }
    }
    public static void swap(Object[] arr,int i,int min){
       Object ted= arr[i];
       arr[i]=arr[min];
       arr[min]=ted;
    }
}
