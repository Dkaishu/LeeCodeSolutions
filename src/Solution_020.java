import java.util.Stack;

/**
 * 有效的括号
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 * <p>
 * 有效字符串需满足：
 * <p>
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "()"
 * 输出: true
 * 示例 2:
 * <p>
 * 输入: "()[]{}"
 * 输出: true
 * 示例 3:
 * <p>
 * 输入: "(]"
 * 输出: false
 * 示例 4:
 * <p>
 * 输入: "([)]"
 * 输出: false
 * 示例 5:
 * <p>
 * 输入: "{[]}"
 * 输出: true
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/valid-parentheses
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution_020 {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0 || s.startsWith(")") || s.startsWith("}")
                || s.startsWith("]")) return false;
        Stack<Character> stack = new Stack<Character>();
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            if (')' == aChar) {
                if (stack.empty() || stack.pop() != '(') return false;
            } else if ('}' == aChar) {
                if (stack.empty() || stack.pop() != '{') return false;
            } else if (']' == aChar) {
                if (stack.empty() || stack.pop() != '[') return false;
            } else {
                stack.push(aChar);
            }
        }
        return stack.empty();
    }

    public static void main(String[] args) {
        long start = System.nanoTime();

        String s = "((){}[)";
        System.out.println("" + new Solution_020().isValid(s));

        System.out.println(System.nanoTime() - start);

    }
}
