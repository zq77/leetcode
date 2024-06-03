package leetcode;

import common.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Solution0141Test {
    private Solution0141 solution;
    @BeforeEach
    void setUp() {
        solution = new Solution0141();
    }
    @Test
    public void test1() {
        ListNode node4 = new ListNode(-4);
        ListNode node2 = new ListNode(2, new ListNode(0, node4));
        node4.next = node2;
        ListNode node = new ListNode(3, node2);
        final boolean result = solution.hasCycle(node);
        assertTrue(result);
    }
    @Test
    public void test2() {
        ListNode node2 = new ListNode(2);
        ListNode node = new ListNode(1, node2);
        node2.next = node;
        final boolean result = solution.hasCycle(node);
        assertTrue(result);
    }

    @Test
    public void test3() {
        ListNode node = new ListNode(1);
        final boolean result = solution.hasCycle(node);
        assertFalse(result);
    }
}
