package leetcode;

import common.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution0328Test {
    private Solution0328 solution;
    @BeforeEach
    void setUp() {
        solution = new Solution0328();
    }
    @Test
    public void test1() {
        ListNode node = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        final ListNode result = solution.oddEvenList(node);
        assertEquals("[1,3,5,2,4]", result.toString());
    }
}
