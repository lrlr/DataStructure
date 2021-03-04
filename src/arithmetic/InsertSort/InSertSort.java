package arithmetic.InsertSort;

/**
 * 插入排序
 * Created by lirui on 2018/12/28.
 */
public class InSertSort {
    public static void sort(Comparable[] arr){
        for (int i=1;i<arr.length;i++){
//            Object e=arr[i];
//            int j;
            for (int j=i;j>0&&arr[j].compareTo(arr[j-1])<0;j--){
                  swap(arr,j,j-1);
            }
        }
    }
    public static void swap(Object[] arr,int i,int j){
        Object t=arr[j];
        arr[j]=arr[i];
        arr[i]=t;
    }

    public static void sorts(Comparable[] arr){
        for (int i=0;i<arr.length;i++){
            for (int j=i;j>0&&arr[j].compareTo(arr[j-1])<0;j--){
               swap(arr,j,j-1);
            }
        }
    }
    public static void sort2(Comparable[] arr){
        for (int i=0;i<arr.length;i++){
            for (int j=i;j>0&&arr[j].compareTo(arr[j+1])>0;j--){
                swap(arr,j,j+1);
            }
        }
    }
    public static void main(String[] args) {
        Integer a[]={9,8,7,6,5,4,3,2,1};
        sorts(a);
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
            }
