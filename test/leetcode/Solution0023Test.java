package leetcode;

import common.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution0023Test {
    private Solution0023 solution;
    @BeforeEach
    void setUp() {
        solution = new Solution0023();
    }
    @Test
    public void test1() {
        ListNode[] list = new ListNode[]{new ListNode(1, new ListNode(4, new ListNode(5))),
                new ListNode(1, new ListNode(3, new ListNode(4))), new ListNode(2, new ListNode(6))};
        final ListNode result = solution.mergeKLists(list);
        assertEquals("[1,1,2,3,4,4,5,6]", result.toString());
    }

}
