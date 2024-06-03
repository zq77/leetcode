package leetcode;

import common.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Solution0142Test {
    private Solution0142 solution;
    @BeforeEach
    void setUp() {
        solution = new Solution0142();
    }
    @Test
    public void test1() {
        ListNode node4 = new ListNode(-4);
        ListNode node2 = new ListNode(2, new ListNode(0, node4));
        node4.next = node2;
        ListNode node = new ListNode(3, node2);
        final ListNode result = solution.detectCycle(node);
        assertEquals(2, result.val);
    }
    @Test
    public void test2() {
        ListNode node2 = new ListNode(2);
        ListNode node = new ListNode(1, node2);
        node2.next = node;
        ListNode result = solution.detectCycle(node);

        assertEquals(1, result.val);
    }

    @Test
    public void test3() {
        ListNode node = new ListNode(1);
        ListNode result = solution.detectCycle(node);
        assertNull(result);
    }
}
