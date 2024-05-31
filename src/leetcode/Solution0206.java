package leetcode;

import common.ListNode;

/**
 * 示例 1：
 *
 * 输入：head = [1,2,3,4,5]
 * 输出：[5,4,3,2,1]
 *
 * 示例 2：
 * 输入：head = [1,2]
 * 输出：[2,1]
 *
 * 示例 3：
 *
 * 输入：head = []
 * 输出：[]
 *
 */
public class Solution0206 {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode node = head.next, prev = head, result = node;
        while (node != null) {
            result = node;
            final ListNode temp = node.next;
            node.next = prev;
            prev = node;
            node = temp;
        }
        head.next = null;
        return result;
    }
}
