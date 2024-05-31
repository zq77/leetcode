package leetcode;

import common.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 示例 1：
 *
 * 输入： listA = [4,1,8,4,5], listB = [5,6,1,8,4,5]
 * 输出： [8,4,5]
 * 解释：相交节点的值为 8 （注意，如果两个链表相交则不能为 0）。
 *
 * 示例 2：
 * 输入： listA = [1,9,1,2,4], listB = [3,2,4]
 * 输出： [2,4]
 * 解释：相交节点的值为 2 （注意，如果两个链表相交则不能为 0）。
 *
 * 示例 3：
 *
 * listA = [2,6,4], listB = [1,5]
 * 输出：null
 * 解释：从各自的表头开始算起，链表 A 为 [2,6,4]，链表 B 为 [1,5]。
 *
 */
public class Solution0160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode pA = headA, pB = headB;
        while (pB != pA) {
            pA = pA == null ? headB : pA.next;
            pB = pB == null ? headA : pB.next;
        }
        return pA;
    }
}
