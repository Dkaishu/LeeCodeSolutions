/**
 * 最长公共前缀
 * <p>
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * <p>
 * 如果不存在公共前缀，返回空字符串 ""。
 * <p>
 * 示例 1:
 * <p>
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * 示例 2:
 * <p>
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 * 说明:
 * <p>
 * 所有输入只包含小写字母 a-z 。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-common-prefix
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution_014 {
    /**
     * 思路一：先取前两个的最长公共前缀，向后移动看是否match，不match则削减一位前缀
     * 思路二：从每项的第一位开始，比较是否相等，直到不等，已通过的位就是最长公共前缀
     *
     * 从提交耗时来看，思路一要好一些
     */

    //思路二
//    public String longestCommonPrefix(String[] strs) {
//        if (strs.length == 0) return "";
//        int index = 0;
//        StringBuilder result = new StringBuilder();
//        while (true) {
//            String cur = "";
//            if (strs[0].length() > index) {
//                cur = strs[0].substring(index, index + 1);
//            } else return result.toString();
//            for (int i = 1; i < strs.length; i++) {
//                if (strs[i].length() > index) {
//                    if (!cur.equals(strs[i].substring(index, index + 1))) {
//                        return result.toString();
//                    }
//
//                } else {
//                    return result.toString();
//                }
//            }
//            result.append(cur);
//            index++;
//        }
//    }
    //思路一
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0 || "".equals(strs[0])) return "";
        if (strs.length == 1) return strs[0];
        String result = strs[0];
        while (result.length() > 0) {
            for (int i = 1; i < strs.length; i++) {
                if (strs[i].length() < result.length() || !result.equals(strs[i].substring(0, result.length()))) {
                    result = result.substring(0, result.length() - 1);
                    i--;
                    continue;
                }
                if (i == strs.length - 1) {
                    return result;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        long start = System.nanoTime();

        String[] s = new String[]{"flower"};
        System.out.println("" + new Solution_014().longestCommonPrefix(s));

        System.out.println(System.nanoTime() - start);

    }
}
