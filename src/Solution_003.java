import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/**
 * 3. 无重复字符的最长子串
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 示例 2:
 * <p>
 * 输入: "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * 示例 3:
 * <p>
 * 输入: "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 * 请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 */
public class Solution_003 {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        if (s.length() == 1) return 1;
        // 记录字符上一次出现的位置
        int[] last = new int[128];
        for(int i = 0; i < 128; i++) {
            last[i] = -1;
        }
        int n = s.length();
        int res = 0;
        int start = 0; // 窗口开始位置
        for(int i = 0; i < n; i++) {
            int index = s.charAt(i);
            start = Math.max(start, last[index] + 1);
            res   = Math.max(res, i - start + 1);
            last[index] = i;
            System.out.println("i:"+i+" index:"+index+" start:"+start+" res:"+res);
        }
        return res;


/*        char[] chars = s.toCharArray();
        if (chars.length == 0) return 0;
        if (chars.length == 1) return 1;
        int left = 0;
        int right = 1;
        HashSet<Character> map = new HashSet<>();
        int unq = 0;
        for (int i = 0; i < chars.length; i++) {
            if (map.add(chars[i])) {
                int curr = right - left;
                if (unq < curr) {
                    unq = curr;
                }
                right++;
            } else {
                map.remove(chars[left]);
                i--;
                left++;
            }
        }
        return unq;*/
    }

    public static void main(String[] args) {
        String s = "pwwkhfuadifhuahushauihfusdhcuiscnuisdbcsdubdysfgydsuhnaiojsiajdioadcniosdnuahdudhhfusihfeuishfiew";
        System.out.println("" + new Solution_003().lengthOfLongestSubstring(s));


    }
}
