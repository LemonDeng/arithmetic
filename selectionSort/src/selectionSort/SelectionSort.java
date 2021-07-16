package selectionSort;

import java.util.Arrays;

/**
 * @ClassName:SelectionSort
 * @Description: 选择排序的思想是：双重循环遍历数组，每经过一轮比较，找到最小元素的下标，将其交换至首位。
 * 0- (n-1)
 * 1- (n-1)
 * ....
 * @Author: Deng Zhi Li
 * @Date: 2021/7/16 8:53
 */
public class SelectionSort {

    public static void seletionSort(int[] arr)
    {
        for (int i = 0; i < arr.length - 1;i++)
        {
            int minIndex = i;
            for (int j = i + 1;j < arr.length;j++)
            {
                if (arr[minIndex] > arr[j])
                {
                    //记录最小值的下标
                    minIndex = j;
                }
            }
            //前后进行调换
            swap(arr,i,minIndex);
        }
    }

    public static void swap(int[] arr,int i,int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{6,2,1,3,5,4};
        seletionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
