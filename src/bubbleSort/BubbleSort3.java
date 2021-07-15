package bubbleSort;

import java.util.Arrays;

/**
 * @ClassName:bubbleSort3
 * @Description: TUDO
 * @Author: Deng Zhi Li
 * @Date: 2021/7/14 16:26
 */
public class BubbleSort3 {
    public static void bubbleSort(int[] arr) {
       boolean swapped = true;

        // 最后一个没有经过排序的元素的下标
       int indexOfLastUnsortedElement = arr.length - 1;

        // 上次发生交换的位置
        int swappedIndex = -1;
        while (swapped)
       {
           swapped = false;
           for (int i = 0; i < indexOfLastUnsortedElement;i++)
           {
            if (arr[i] > arr[i+1])
            {
                swap(arr,i,i+1);
                swapped = true;
                swappedIndex = i;
            }
           }
           indexOfLastUnsortedElement = swappedIndex;
       }
    }
    // 交换元素
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int [] arr = new int[]{6,2,1,3,5,4};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
