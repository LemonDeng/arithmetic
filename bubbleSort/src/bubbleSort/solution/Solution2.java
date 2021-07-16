package bubbleSort.solution;

import java.util.Arrays;

/**
 * @ClassName:Solution2
 * @Description: TUDO
 * @Author: Deng Zhi Li
 * @Date: 2021/7/15 10:13
 */
public class Solution2 {

    public static void moveZeroes(int[] nums) {

        //记录末尾0的个数
       int zereCount = 0;

       for (int i = 0; i < nums.length - zereCount;i++)
       {
           if (nums[i] == 0)
           {
               for (int j = i; j < nums.length - zereCount - 1;j++)
               {
                   exchange(nums,j,j+1);
               }
               // 末尾多了一个 0，记录下来，以缩小遍历范围
               zereCount++;
               //下一轮遍历时 i 会增加 1，但此时 nums[i] 已经和 nums[i+1] 交换了，nums[i+1] 还没有判断是否为 0，所以这里先减 1，以使下一轮继续判断 i 位置。
               i--;
           }

       }
    }

    public static void exchange(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int [] arr = new int[]{0,12,0,3,1};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }

}
