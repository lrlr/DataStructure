package arithmetic.selectionSort;

/**
 * Created by lirui on 2019/2/25.
 */
public class SelectionTest2 {
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

        private static void swap(Comparable[] arr,int i,int min){
        Object o=arr[i];
        arr[i]=arr[min];
        arr[min]=(Comparable) o;
        }

    public static void main(String[] args) {
        Comparable[] comparables={4,3,7,1,9,0};
        sort(comparables);
        for (Comparable a:comparables){
            System.out.println(a);
        }
    }
}
