package arrayLeetCodeOffer03;

/**
 * @ClassName:ArrayLeetCodeOffer03
 * @Description: 找出数组中重复的数字。
 *
 * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
 * 示例 1：
 * 输入：
 * [2, 3, 1, 0, 2, 5, 3]
 * 输出：2 或 3
 *
 * @Author: Deng Zhi Li
 * @Date: 2021/8/12 21:41
 */
public class ArrayLeetCodeOffer03 {
    public int findRepeatNumber(int[] nums) {
        int i = 0;
        if (nums.length == 0 || nums == null) return -1;
        for (i = 0;i < nums.length-1;i++)
        {
            for (int j = i+1;j < nums.length - 1;j++)
            {
                if (nums[i] == nums[j])
                {
                    return nums[i];
                }

            }
        }
        return nums[i];
    }
}
