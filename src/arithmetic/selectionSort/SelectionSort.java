package arithmetic.selectionSort;

/**
 * 选择排序
 * 算法步骤
 * <p>
 * 首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置
 * 2.再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾。
 * 3.重复第二步，直到所有元素均排序完毕。
 * Created by lirui on 2018/12/28.
 */
public class
SelectionSort {

    public static void sort(Comparable[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j].compareTo(arr[min]) < 0) {
                    min = j;
                }
            }
            swap(arr, i, min);
        }
    }

    public static void swap(Object[] arr, int i, int j) {
        Object t = arr[j];
        arr[j] = arr[i];
        arr[i] = t;
    }

    public static void sortA(Comparable[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].compareTo(arr[min]) < 0) {
//                    swap(arr,j,min);
                    min = j;
                }
            }
            swap(arr, i, min);
        }
    }

    public static void main(String[] args) {
        Integer a[] = {1, 8, 3, 5, 7, 2, 0, 4};
        sortA(a);
        System.out.println("测试");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
