package leetcode;

import common.ListNode;

/**
 * 示例 1：
 * 输入：head = [1,2,3,4,5]
 * 输出：[3,4,5]
 * 解释：链表只有一个中间结点，值为 3 。
 *
 * 示例 2：
 * 输入：head = [1,2,3,4,5,6]
 * 输出：[4,5,6]
 * 解释：该链表有两个中间结点，值分别为 3 和 4 ，返回第二个结点。
 *
 */
public class Solution0876 {
    public ListNode middleNode(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode mid = head, fast = head, prev = head;
        int i = 0;
        while (fast != null) {
            prev = mid;
            mid = mid.next;
            fast = fast.next;
            i ++;
            if ( fast != null) {
                fast = fast.next;
                i ++;
            }
        }
        return i % 2 == 0 ? mid : prev;
    }
}
