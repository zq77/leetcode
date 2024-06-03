package leetcode;

import common.ListNode;

import java.util.Stack;

/**
 * 示例 1：
 * 输入：head = [1,2,3,4,5], left = 2, right = 4
 * 输出：[1,4,3,2,5]
 *
 * 示例 2：
 *
 * 输入：head = [5], left = 1, right = 1
 * 输出：[5]
 */
public class Solution0092 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || head.next == null || left >= right) {
            return head;
        }
        Stack<ListNode> stack = new Stack<>();
        ListNode cur = head, prev = null, end = null;
        int i = 1;
        while (cur != null) {
            if (i >= left && i <= right) {
                stack.push(cur);
            }
            // 找到翻转之前的左节点
            if (i < left) {
                prev = cur;
            }
            // 找到翻转之后的右节点
            if (i == (right + 1)) {
                end = cur;
            }
            cur = cur.next;
            i ++;
        }

        ListNode first = stack.pop();
        if (prev == null) {
            head = first;
        } else {
            prev.next = first;
        }
        while (!stack.isEmpty()) {
            final ListNode temp = stack.pop();
            temp.next = null;
            first.next = temp;
            first = temp;
        }
        if (end != null) {
            first.next = end;
        }

        return head;
    }
}
