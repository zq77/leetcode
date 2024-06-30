package leetcode;

import common.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution0024Test {
    private Solution0024 solution;
    @BeforeEach
    void setUp() {
        solution = new Solution0024();
    }
    @Test
    public void test1() {
        final ListNode node = solution.swapPairs(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4)))));
        assertEquals("[2,1,4,3]", node.toString());
    }
    @Test
    public void test2() {
        final ListNode node = solution.swapPairs(new ListNode(1));
        assertEquals("[1]", node.toString());
    }
}
