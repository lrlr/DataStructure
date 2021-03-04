package arithmetic.MergeSort;

/**
 * Created by lirui on 2019/3/1.
 */
public class MergeSortTest {
    public static  void  mergeSort(int arr[],int left,int right){
        if (left<right){
            int mid=(left+right)/2;
            mergeSort(arr,left,mid);
            mergeSort(arr,mid+1,right);
        }
    }
    public static void sort(int[] arr,int left,int mid,int right){
        int[] temp=new int[right-left+1];
        int i=left;
        int j=mid+1;
        int k=0;
        while (i<=mid&&j<=right){
            if (arr[i]<arr[j]){
                temp[k++]=arr[i++];
            }else{
                temp[k++]=arr[j++];
            }
        }
        while (i<=mid){
            temp[k++]=arr[i++];
        }
        while (j<=right){
            temp[k++]=arr[j++];
        }
        //将temp中的元素全部拷贝到原数组中
        for (int k2 = 0; k2 < temp.length; k2++) {
            arr[k2 + left] = temp[k2];
        }
    }
}
