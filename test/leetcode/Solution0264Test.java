package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution0264Test {
    private Solution0264 solution;
    @BeforeEach
    void setUp() {
        solution = new Solution0264();
    }
    @Test
    public void test1() {
        final int result = solution.nthUglyNumber(10);
        assertEquals(12, result);
    }
    @Test
    public void test2() {
        final int result = solution.nthUglyNumber(1);
        assertEquals(1, result);
    }
    @Test
    public void test3() {
        final int result = solution.nthUglyNumber(11);
        assertEquals(15, result);
    }
}
