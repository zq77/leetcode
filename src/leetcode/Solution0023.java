package leetcode;


import common.ListNode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution0023 {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length < 1) {
            return null;
        }
        if (lists.length < 2) {
            return lists[0];
        }
        return mergeSort(lists);
    }

    private ListNode mergeSort(ListNode[] lists) {
        if (lists.length == 1) {
            return lists[0];
        }
        ListNode[] result = new ListNode[lists.length/2 + lists.length%2];
        int index = 0;
        for (int i = 0; i < lists.length; i = i+2) {
            if (i+1 == lists.length) {
                result[index] = lists[i];
                break;
            }
            result[index ++] = sort(lists[i], lists[i+1]);
        }
        return mergeSort(result);
    }

    public ListNode mergeKLists2(ListNode[] lists) {
        if (lists == null || lists.length < 1) {
            return null;
        }
        ListNode result = lists[0];
        for (int i = 1; i < lists.length; i++) {
            result = sort(result, lists[i]);
        }
        return result;
    }

    private ListNode sort(ListNode current, ListNode next) {
        if (next == null) {
            return current;
        }
        if (current == null) {
            return next;
        }
        ListNode node = new ListNode();
        ListNode top = node;
        while (current != null || next != null) {
            if (current != null && next == null) {
                node.next = current;
                break;
            }
            if (current == null && next != null) {
                node.next = next;
                break;
            }
            if (current.val > next.val) {
                node.next = next;
                next = next.next;
            } else {
                node.next = current;
                current = current.next;
            }
            node = node.next;
        }
        return top.next;
    }
}