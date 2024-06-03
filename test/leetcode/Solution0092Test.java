package leetcode;

import common.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class Solution0092Test {
    private Solution0092 solution;
    @BeforeEach
    void setUp() {
        solution = new Solution0092();
    }
    @Test
    public void test1() {
        ListNode node = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        final ListNode result = solution.reverseBetween(node, 2, 4);
        assertEquals("[1,4,3,2,5]", result.toString());
    }
    @Test
    public void test2() {
        ListNode node = new ListNode(5);
        final ListNode result = solution.reverseBetween(node, 1, 1);
        assertEquals("[5]", result.toString());
    }
    @Test
    public void test3() {
        ListNode node = new ListNode(5, new ListNode(4));
        final ListNode result = solution.reverseBetween(node, 1, 2);
        assertEquals("[4,5]", result.toString());
    }
    @Test
    public void test4() {
        ListNode node = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        final ListNode result = solution.reverseBetween(node, 1, 2);
        assertEquals("[2,1,3,4,5]", result.toString());
    }
}
