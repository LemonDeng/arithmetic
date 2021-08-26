package addBinary;

/**
 * @ClassName:addBinary
 * @Description: TUDO
 * @Author: Deng Zhi Li
 * @Date: 2021/8/25 15:32
 */
public class addBinary {
    public static void main(String[] args) {
        String s = addBinary("11", "10");
        System.out.println(s);
    }
    public static String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        while (i >= 0 || j >= 0) {
            int digitA = i >= 0 ? a.charAt(i--) - '0' : 0;
            int digitB = j >= 0 ? b.charAt(j--) - '0' : 0;
            int sum = digitA + digitB + carry;
            carry = sum >= 2 ? 1 : 0;
            sum = sum >= 2 ? sum - 2 : sum;
            result.append(sum);
        }

        if (carry == 1) {
            result.append(1);
        }

        return result.reverse().toString();
    }
}
