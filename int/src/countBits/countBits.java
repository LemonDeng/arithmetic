package countBits;

import org.junit.Test;

/**
 * @ClassName:countBits
 * @Description: TUDO
 * @Author: Deng Zhi Li
 * @Date: 2021/8/26 9:46
 */
public class countBits {

    public static void main(String[] args) {
        int[] ints = countBits(5);
        for (int s:ints
             ) {
            System.out.print(s+" ");
        }

    }
    public static int[] countBits(int num) {
        int[] result = new int[num + 1];
        for (int i = 1; i <= num; ++i) {
            //思想：如果整数i为偶数和i/2的1的个数相同，基数的话多一个1
            result[i] = result[i >> 1] + (i & 1);
        }
        return result;
    }
}
