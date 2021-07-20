package insertSort;

import java.util.Arrays;

/**
 * @ClassName:InsertSort
 * @Description: 插入排序,从第二个数开始，如果第二个数比第一个数小的话交换
 * @Author: Deng Zhi Li
 * @Date: 2021/7/20 9:27
 */
public class InsertSort {

    public static void insertSort(int[] arr)
    {
        // 从第二个数开始，往前插入数字
        for (int i = 1; i < arr.length; i++)
        {
            //j 记录当前数字下标
            int j = i;
            // 当前数字比前一个数字小，则将当前数字与前一个数字交换
            while (j >= 1 && arr[j] < arr[j-1])
            {
                swap(arr,j,j-1);
                // 更新当前数字下标
                j--;
            }

        }
    }


    public static void swap(int[] arr ,int i ,int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{6,2,1,3,5,4};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
