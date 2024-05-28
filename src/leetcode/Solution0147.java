package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 输入：head = [4,2,1,3]
 * 输出：[1,2,3,4]
 * 输入：head = [-1,5,3,4,0]
 * 输出：[-1,0,3,4,5]
 * 输入：head = []
 * 输出：[]
 */
public class Solution0147 {
    public ListNode insertionSortList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode result = new ListNode(0);
        result.next = head;
        ListNode cur = head.next;
        while (cur != null) {
            if (cur.val < head.val) {
                ListNode prev = result;
                while (prev.next.val <= cur.val) {
                    prev = prev.next;
                }
                // core code
                // 1. 当前指针指向的next 给上一个节点
                head.next = cur.next;
                // 2. 将大于当前节点的节点只想当前节点的next
                cur.next = prev.next;
                // 3. 将当前节点指向上一个节点
                prev.next = cur;
            } else {
                head = head.next;
            }
            cur = head.next;
        }
        return result.next;
    }

}