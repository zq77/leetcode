package leetcode;

import common.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution0206Test {
    private Solution0206 solution;
    @BeforeEach
    void setUp() {
        solution = new Solution0206();
    }
    @Test
    public void test1() {

        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode result = solution.reverseList(head);
        assertEquals("[5,4,3,2,1]", result.toString());
    }
    @Test
    public void test2() {

        ListNode head = new ListNode(1, new ListNode(2));
        ListNode result = solution.reverseList(head);
        assertEquals("[2,1]", result.toString());
    }
    @Test
    public void test3() {
        ListNode result = solution.reverseList(new ListNode());
        assertEquals("[0]", result.toString());
    }
}
