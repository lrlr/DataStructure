package arithmetic.InsertSort;

/**
 * 插入排序优化
 * Created by lirui on 2018/12/28.
 */
public class InsertSortAdvance {
    public static void sort(Comparable[] arr){
        for (int i=1;i<arr.length;i++){
            Comparable e=arr[i];
          int j=i;
            for (;j>0&&arr[j-1].compareTo(e)>0;j--){
               arr[j]=arr[j-1];
            }
            arr[j]=e;
        }
    }
    public static void swap(Object[] arr,int i,int j){
        Object t=arr[j];
        arr[j]=arr[i];
        arr[i]=t;
    }

    public static void main(String[] args) {
        Integer[] a={3,4,2,1};
        sort(a);
        for (int as:a){
            System.out.println(a[as]);
        }
    }
}
