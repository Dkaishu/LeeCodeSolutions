/**
 * 5. 最长回文子串
 * <p>
 * 回文的意思是正着念和倒着念一样，如：上海自来水来自海上
 * <p>
 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假 s 的最大长度为 1000。
 * <p>
 * 示例 1：
 * <p>
 * 输入: "babad"
 * 输出: "bab"
 * 注意: "aba" 也是一个有效答案。
 * 示例 2：
 * <p>
 * 输入: "cbbd"
 * 输出: "bb"
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-palindromic-substring
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class Solution_005 {
    public String longestPalindrome(String s) {
        String result = "";
        int len = s.length() % 2 > 0 ? s.length() / 2 + 1 : s.length() / 2;
        for (int i = 0; i < s.length(); i++) {

        }

        return result;
    }
}
