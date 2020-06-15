/**
 * 7.整数反转
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 123
 * 输出: 321
 *  示例 2:
 * <p>
 * 输入: -123
 * 输出: -321
 * 示例 3:
 * <p>
 * 输入: 120
 * 输出: 21
 * 注意:
 * <p>
 * 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−2^31,  2^31 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-integer
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution_007 {
    public int reverse(int x) {
//        int取值范围是从-2147483648 至2147483647（-231至231-1） ，包括-2147483648 和2147483647。
        int digit = 1;
        int digitValue = 0;
        int result = 0;
        do {
            digitValue = x % 10;
            if (digit == 10 && x < 0 && (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && digitValue > 8))) {
                return 0;
            }
            if (digit == 10 && x > 0 && result > Integer.MAX_VALUE/10 ||(result == Integer.MAX_VALUE / 10 && digitValue > 7)) {
                return 0;
            }
            result = result * 10 + digitValue;
            x = x / 10;
            digit++;
        } while (x != 0 && digit <= 10);
        return result;
    }


    public static void main(String[] args) {
        int x = -1463847412;
        System.out.println("" + new Solution_007().reverse(x));

    }
}
