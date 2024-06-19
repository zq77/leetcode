package leetcode;

import common.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution0299Test {
    private Solution0299 solution;
    @BeforeEach
    void setUp() {
        solution = new Solution0299();
    }
    @Test
    public void test1() {
        String result = solution.getHint("1807", "7810");
        assertEquals("1A3B", result);
    }
    @Test
    public void test2() {
        String result = solution.getHint("1123", "0111");
        assertEquals("1A1B", result);
    }
}
