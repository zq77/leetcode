package leetcode;


import common.ListNode;

import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Solution0083 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        Set<Integer> set = new HashSet<>();
        set.add(head.val);
        ListNode prev = head, node = head.next;
        while(node != null) {
            if (set.add(node.val)) {
                prev = node;
                node = node.next;
            } else {
                prev.next = node.next;
                node = node.next;
            }
        }
        return head;
    }
}