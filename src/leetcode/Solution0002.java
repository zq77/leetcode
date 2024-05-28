package leetcode;

import common.ListNode;

/**
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 */
public class Solution0002 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null) {
            return null;
        }
        ListNode orgResult = new ListNode();
        ListNode result = orgResult;
        int cursor = 0;
        while (l1 != null || l2 != null) {
            int value = cursor;
            if (l1 != null) {
                value += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                value += l2.val;
                l2 = l2.next;
            }
            if (value >= 10) {
                cursor = value / 10;
                value = value % 10;
            } else {
                cursor = 0;
            }
            result.next = new ListNode(value);
            result = result.next;
        }
        if (cursor > 0) {
            result.next = new ListNode(cursor);
        }
        return orgResult.next;
    }

}