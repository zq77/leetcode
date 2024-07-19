package leetcode;

import common.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution0083Test {
    private Solution0083 solution;
    @BeforeEach
    void setUp() {
        solution = new Solution0083();
    }
    @Test
    public void test1() {
        final ListNode node = solution.deleteDuplicates(new ListNode(1, new ListNode(1, new ListNode(2))));
        assertEquals("[1,2]", node.toString());
    }
}
