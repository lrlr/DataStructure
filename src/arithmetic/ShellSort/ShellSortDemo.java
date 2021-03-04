package arithmetic.ShellSort;

/**
 * Created by lirui on 2019/3/5.
 */
public class ShellSortDemo {
    public static void shellSort(Comparable[] arr) {
        for (int stamp = arr.length / 2; stamp > 0; stamp = stamp / 2) {
            for (int i = stamp; i < arr.length; i++) {
                int j = i;
                Object temp = arr[j];
                //j-stamp就是代表与他同组的隔壁元素
                while ((j - stamp )>=0 && arr[j - stamp].compareTo(temp) > 0) {
                    arr[j] = arr[j - stamp];
                    j = j - stamp;
                }
                arr[j] = (Comparable) temp;
            }
        }



    }

    public static void main(String[] args) {
        Comparable[] arr={1,5,3,0,7,5,9,3};
        shellSort(arr);
        for (Comparable c:arr){
            System.out.println(c);
        }
    }
}
