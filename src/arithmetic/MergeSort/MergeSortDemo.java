package arithmetic.MergeSort;

/**
 * Created by lirui on 2019/3/4.
 */
public class MergeSortDemo {
    public static void margeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            margeSort(arr, left, mid);
            margeSort(arr, mid + 1, right);

        }
    }

    public static void marge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left];
        int i = left;
        int j = mid + 1;
        int k = 0;
        while (i < mid && j <= right) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= right) {
            temp[k++] = arr[j++];
        }
        for (int k2 = 0; k2 < temp.length; k2++) {
            arr[k2 + i] = temp[k2];
        }
    }
}
