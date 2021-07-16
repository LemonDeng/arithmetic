package bubbleSort;

import java.util.Arrays;

/**
 * @ClassName:bubbleSort
 * @Description: 冒泡排序
 * @Author: Deng Zhi Li
 * @Date: 2021/7/14 8:57
 */
public class BubbleSort {
    public static void bubbleSort(int[] arr)
    {
        for (int i = 0;i < arr.length - 1;i++) //多少趟
        {
            for (int j = 0;j < arr.length -1 -i;j++ )//每趟里面需要比较多少次
            {
                if (arr[j] > arr[j+1])
                {
                    swap(arr,j,j+1);
                }
            }
        }
    }
    //交换
    public static void swap(int [] arr,int i ,int j)
    {
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
