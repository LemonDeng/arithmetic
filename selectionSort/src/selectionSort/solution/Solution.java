package selectionSort.solution;

import java.util.Arrays;

/**
 * @ClassName:Solution
 * @Description: 数组中的第 K 个最大元素
 * @Author: Deng Zhi Li
 * @Date: 2021/7/16 10:29
 */
public class Solution {

    public static int findKthLargest(int[] nums, int k) {
        for (int i = 0;i < k;i++)
        {
            int maxIndex = i;
            for (int j = i + 1;j<nums.length;j++)
            {
                if (nums[maxIndex] < nums[j])
                {
                    maxIndex = j;
                }
            }
            swap(nums,i,maxIndex);
        }
        return nums[k - 1];
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{6,2,1,3,5,4};
        int i = findKthLargest(arr, 2);
        System.out.println(i);
    }

}
