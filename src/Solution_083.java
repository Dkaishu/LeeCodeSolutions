import java.util.HashMap;
import java.util.Map;

/**
 * 83.删除排序链表中的重复元素
 * 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
 * <p>
 * 示例1:
 * <p>
 * 输入: 1->1->2
 * 输出: 1->2
 * 示例2:
 * <p>
 * 输入: 1->1->2->3->3
 * 输出: 1->2->3
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution_083 {
    public ListNode deleteDuplicates(ListNode head) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        ListNode cur = head;
//        ListNode result = new ListNode(cur.val);
        while (cur != null && cur.next != null) {
            if (map.containsKey(cur.val)) {
                cur.next = cur.next.next;
            } else {
                map.put(cur.val, cur.val);
            }
            cur = cur.next;
        }
        return head;

    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
