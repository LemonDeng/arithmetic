package arrayLeetCode283;

import java.util.Arrays;

/**
 * @ClassName:ArrayLeetCode283
 * @Description: 移动零：给定一个数组nums，编写一个函数将所有的0移动到数组的末尾，同时保持非零元素的相对顺序
 * @Author: Deng Zhi Li
 * @Date: 2021/8/2 9:36
 */
public class ArrayLeetCode283 {
    public static void main(String[] args) {
        int[] nums = new int[]{0,1,0,0,12,5,6};
        ArrayLeetCode283.moveTheZero(nums);
        System.out.println(Arrays.toString(nums));

    }
    public static void moveTheZero(int[] nums)
    {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0)
            {
                nums[index] = nums[i];
                index++;
            }
        }
        for (int i = index; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
