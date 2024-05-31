package leetcode;

import common.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution0876Test {
    private Solution0876 solution;
    @BeforeEach
    void setUp() {
        solution = new Solution0876();
    }
    @Test
    public void test1() {

        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode result = solution.middleNode(head);
        assertEquals("[3,4,5]", result.toString());
    }
    @Test
    public void test2() {

        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6))))));
        ListNode result = solution.middleNode(head);
        assertEquals("[4,5,6]", result.toString());
    }
}
