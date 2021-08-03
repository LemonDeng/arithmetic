package arrayLeetCode27;

/**
 * @ClassName:RemoveZero
 * @Description:移除零，给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
 *
 * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
 *
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 *
 * @Author: Deng Zhi Li
 * @Date: 2021/8/3 14:31
 */
public class RemoveZero {
    public static void main(String[] args) {
        int[] nums = new int[]{3,2,2,3,2,2,2,3};
        int i = RemoveZero.removeElement(nums, 3);
        System.out.println(i);
    }
    public  static int removeElement(int[] nums, int val) {
        if (nums == null ||  nums.length == 0)
        {
            return 0;
        }
        //双指针思想，从左边开始移动,找到val值停下来
        int left = 0;
        //双指针思想，从左边开始移动,找不到val值停下来
        int right = nums.length - 1;
        while (left < right)
        {
            while (left < right && nums[left] != val)
            {
                left++;
            }
            while (left < right && nums[right] == val)
            {
                right--;
            }
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
        }
        //三目云算法的消耗的内存要比if,lese要少很多
        return nums[left] == val?left:left+1;

    }
}
