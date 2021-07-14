package bubbleSort;

import java.util.Arrays;

/**
 * @ClassName:bubbleSort2
 * @Description: TUDO
 * @Author: Deng Zhi Li
 * @Date: 2021/7/14 16:05
 */
public class bubbleSort2 {
    public static void bubbleSort2(int[] arr)
    {
        boolean swapped = true;
        for (int i = 0;i < arr.length - 1;i++)
        {
            if (!swapped) break;
            swapped = false;
            for (int j = 0;j < arr.length - 1 - i;j++ )
            {

                if (arr[j] > arr[j+1])
                {
                    swap(arr,j,j+1);
                    swapped = true;
                }
            }
        }
    }
    // 交换元素
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int [] arr = new int[]{1,2,3,4,5};
        bubbleSort2(arr);
        System.out.println(Arrays.toString(arr));
    }


}
