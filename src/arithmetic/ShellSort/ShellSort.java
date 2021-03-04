package arithmetic.ShellSort;

import java.util.Arrays;

/**
 * 希尔排序
 * 设待排序元素序列有n个元素，首先取一个整数increment（小于n）作为间隔将全部元素分为increment个子序列，所有距离为increment的元素放在同一个子序列中，在每一个子序列中分别实行直接插入排序。
 * 然后缩小间隔increment，重复上述子序列划分和排序工作。直到最后取increment=1，将所有元素放在同一个子序列中排序为止。
 * （2）由于开始时，increment的取值较大，每个子序列中的元素较少，排序速度较快，到排序后期increment取值逐渐变小，子序列中元素个数逐渐增多，但由于前面工作的基础，大多数元素已经基本有序，所以排序速度仍然很快。
 */
public class ShellSort {
    public static int[] sort(int[] arrays) throws Exception {
        for (int step = arrays.length / 2; step > 0; step /= 2) {
            //从增量那组开始进行插入排序，直至完毕
            for (int i = step; i < arrays.length; i++) {
                int j = i;
                int temp = arrays[j];
                // j - step 就是代表与它同组隔壁的元素
                while (j - step >= 0 && arrays[j - step] > temp) {
                    arrays[j] = arrays[j - step];
                    j = j - step;
                }
                arrays[j] = temp;
            }
        }
        return arrays;
    }
    public static int[] sorts(int[] arr){
        for (int step=arr.length/2;step>0;step/=2){
            for (int i=step;i<arr.length;i++){
                int j=i;
                int temp=arr[j];
                while (j-step>=0&&arr[j-step]>temp){
                    arr[j]=arr[j-step];
                    j=j-step;
                }
                arr[j]=temp;
            }
        }
        return arr;
    }
    public static void main(String[] args) throws Exception {
        int[] arr = {1, 4, 2, 9, 5, 0, 7, 8};
        int[] sort = sortss(arr);
        for (int i:sort){
            System.out.println(i);
        }
    }
public static int[] sortss(int[] arr){
        for (int step=arr.length/2;step>0;step/=2){
            for (int i=step;i<arr.length;i++){
                int j=i;
                int temp=arr[j];
                while (j-step>=0&&arr[j-step]>temp){
                    arr[j]=arr[j-step];
                    j=j-step;
                }
                arr[j]=temp;
            }
        }
        return arr;
}
 /*   public static void sorts(Comparable[] arr) {
        for (int i = arr.length / 2; i > 0; i /= 2) {
            for (int j = i; j < arr.length; j++) {
                int e = j;
                Comparable temp = arr[j];
                while (e - i >= 0 && arr[e - i].compareTo(temp) > 0) {
                    arr[e] = arr[e - i];
                    e = e - i;
                }
                arr[e] = temp;
            }
        }
    }*/


}
