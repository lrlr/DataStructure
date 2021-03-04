package arithmetic.InsertSort;

/**
 * Created by lirui on 2019/2/26.
 */
public class InsertSortTestOne {
    public static void sort(Comparable[] arr){
     for (int i=0;i<arr.length;i++){
         for (int j=i;j>0&&arr[j].compareTo(arr[j-1])<0;j--){
             swap(arr,j, j-1);
         }
     }
    }
    public static  void swap(Comparable[] arr,int i,int j){
        Object o=arr[i];
        arr[i]=arr[j];
        arr[j]=(Comparable) o;
    }
    public static void main(String[] args) {
      Integer[] arr={1,4,5,2,7,4,9,6,0,8};
      sort(arr);
      for (Integer a:arr){
          System.out.println(arr[a]);
      }
    }
}
