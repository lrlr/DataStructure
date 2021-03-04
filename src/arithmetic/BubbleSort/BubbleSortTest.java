package arithmetic.BubbleSort;

/**
 * Created by lirui on 2019/2/25.
 */
public class BubbleSortTest {
    public static void sort(Comparable[] arr){
        for (int i=0;i<arr.length;i++){
            boolean flag=true;
            for (int j=0;j<arr.length-i-1;j++){
             if (arr[j].compareTo(arr[j+1])<0){
                 Object o=arr[j];
                 arr[j]=arr[j+1];
                 arr[j+1]=(Comparable) o;
                 flag=false;
             }
            }
        }
    }
    public static void main(String[] args) {
         Comparable[] arr={1,9,8,2,3,5,0};
         sort(arr);
         for (Comparable a:arr){
             System.out.println(a);
         }
    }
}
