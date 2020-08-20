import java.util.List;

/**
 * 两数相加
 * <p>
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * <p>
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * <p>
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * <p>
 * 示例：
 * <p>
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 */
public class Solution_002 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 != null && l2 != null) {
            return new ListNode(0);
        }
        ListNode n1 = l1;
        ListNode n2 = l2;
        ListNode result = new ListNode(-1);
        ListNode next = new ListNode(-1);
        boolean flag = false;
        while (n1 != null || n2 != null || flag) {
            int sum = 0;
            if (n1 != null) {
                sum += n1.val;
                n1 = n1.next;
            }
            if (n2 != null) {
                sum += n2.val;
                n2 = n2.next;
            }
            if (flag) {
                sum += 1;
            }
            if (sum >= 10) {
                flag = true;
                sum -= 10;
            } else {
                flag = false;
            }
            next.val = sum;
            if (result.next == null) {
                result.next = next;
            }
            if (n1 != null || n2 != null || flag) {
                next.next = new ListNode(-1);
                next = next.next;
            }
        }
        return result.next;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {

    }

}
