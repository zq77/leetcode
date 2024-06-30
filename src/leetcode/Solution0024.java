package leetcode;

import common.ListNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 示例 1：
 *
 * 输入：head = [1,2,3,4]
 * 输出：[2,1,4,3]
 * 示例 2：
 *
 * 输入：head = []
 * 输出：[]
 * 示例 3：
 *
 * 输入：head = [1]
 * 输出：[1]
 */
public class Solution0024 {

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode result = head.next;
        head.next = result.next;
        result.next = head;
        ListNode node = head.next, prev = head;
        while(node != null) {
            ListNode temp = node.next;
            if (temp == null) {
                break;
            }
            node.next = temp.next;
            temp.next = node;
            prev.next = temp;
            prev = node;
            node = node.next;
        }
        return result;
    }

}
