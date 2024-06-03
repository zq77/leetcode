package leetcode;

import common.ListNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 示例 1：
 * 输入: head = [1,2,3,4,5]
 * 输出: [1,3,5,2,4]
 *
 * 示例 2：
 *
 * 输入: head = [2,1,3,5,6,4,7]
 * 输出: [2,3,6,7,1,5,4]
 */
public class Solution0328 {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode odd = head;
        ListNode evenHead = head.next;
        ListNode even = evenHead;
        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }
    public ListNode oddEvenList2(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        List<ListNode> oddList = new ArrayList<>();
        List<ListNode> evenList = new ArrayList<>();
        int i = 1;
        while (head != null) {
            if (i % 2 == 1) {
                oddList.add(head);
            } else {
                evenList.add(head);
            }
            i ++;
            head = head.next;
        }
        ListNode root = oddList.get(0);
        ListNode node = root;
        for (int i1 = 1; i1 < oddList.size(); i1++) {
            node.next = oddList.get(i1);
            node = node.next;
        }
        for (int i1 = 0; i1 < evenList.size(); i1++) {
            node.next = evenList.get(i1);
            node = node.next;
        }
        node.next = null;
        return root;
    }
}
