package leetcode;

import common.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class Solution0160Test {
    private Solution0160 solution;
    @BeforeEach
    void setUp() {
        solution = new Solution0160();
    }
    @Test
    public void test1() {
        ListNode common = new ListNode(8, new ListNode(4, new ListNode(5)));
        ListNode headA = new ListNode(4, new ListNode(1, common));
        ListNode headB = new ListNode(5, new ListNode(6, new ListNode(1, common)));
        ListNode result = solution.getIntersectionNode(headA, headB);
        assertEquals("[8,4,5]", result.toString());
    }
    @Test
    public void test2() {
        ListNode common = new ListNode(2, new ListNode(4));
        ListNode headA = new ListNode(1, new ListNode(9, new ListNode(1, common)));
        ListNode headB = new ListNode(3, common);
        ListNode result = solution.getIntersectionNode(headA, headB);
        assertEquals("[2,4]", result.toString());
    }
    @Test
    public void test3() {
        ListNode headA = new ListNode(2, new ListNode(6, new ListNode(4)));
        ListNode headB = new ListNode(1, new ListNode(5));
        ListNode result = solution.getIntersectionNode(headA, headB);
        assertNull(result);
    }
}
