package arrayLeetCode485;

/**
 * @ClassName:ArrayLeetCode485
 * @Description: 给定一个二进制的数组，计算其中最大连续1得到个数
 * @Author: Deng Zhi Li
 * @Date: 2021/8/1 21:26
 */
public class ArrayLeetCode485 {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 0, 1, 1, 1,0,1,1,1,1,1};
        int sum = ArrayLeetCode485.arraySum(nums);
        System.out.println(sum);
    }

    public static int arraySum(int[] nums) {
        int count = 0;
        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
            } else {
                count = 0;
            }
            if (count > result) {
                result = count;
            }
        }

        return result;
    }
}
