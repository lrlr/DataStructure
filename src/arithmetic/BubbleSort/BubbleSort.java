package arithmetic.BubbleSort;

/**
 * 冒泡排序
 * Created by lirui on 2019/1/2.
 */
public class BubbleSort {
public static void sort(Comparable[] arr){
    for (int i=0;i<arr.length;i++){
        boolean flag=true;
        for (int j=0;j<arr.length-i-1;j++){
            if (arr[j].compareTo(arr[j+1])<0){
                Object s=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]= (Comparable) s;
                flag=false;
            }
        }
        if (flag){
            break;
        }
    }
}

public static void sorts(Comparable[] arr){
    for (int i=0;i<arr.length;i++){
        boolean flag=true;
        for (int j=0;j<arr.length-i-1;j++){
            if (arr[j].compareTo(arr[j + 1]) > 0) {
                Object s = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = (Comparable) s;
                      flag=false;
            }
        }
        if (flag){
            break;
        }

    }
}
    public static void main(String[] args) {
        Integer[] arrs={9,7,5,4,3,2,1,6,0,5};
        sorts(arrs);
        for (int i=0;i<arrs.length;i++){
            System.out.println(arrs[i]);
        }
    }
}
