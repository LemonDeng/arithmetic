package bubbleSort.solution;

import java.util.Arrays;

/**
 * @ClassName:Solution
 * @Description: 把数组排成最小的数
 * @Author: Deng Zhi Li
 * @Date: 2021/7/14 15:58
 * 这道题本质上是一道排序题，并且只能由基于比较的排序算法完成。如果 a 和 b 组成的字符串大于 b 和 a 组成的字符串，则交换 a 和 b。
 */
public class Solution {


    public static String minNumber(int [] arr)
    {
        bubbleSort(arr);
        return Arrays.toString(arr).replaceAll("\\[|]|,|\\s","");
    }

    public static void bubbleSort(int[] arr) {
       boolean swapped =true;
       //最后一个没有经过排序元素的位置
        int indexOfLastUnsortedElement = arr.length - 1;
        //最后一次交换的位置
        int swappedIndex = -1;
        while (swapped)
        {
            for (int i = 0;i < indexOfLastUnsortedElement;i++)
            {
                swapped = false;
                if (("" + arr[i] + arr[i+1]).compareTo("" + arr[i+1] + arr[i]) > 0)
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
        int[] arr = new int[]{6, 2, 1, 3, 5, 4};
        String s = minNumber(arr);
        System.out.println(s);
        //System.out.println(Arrays.toString(arr));
    }


}
