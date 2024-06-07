package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution0020Test {
    private Solution0020 solution;
    @BeforeEach
    void setUp() {
        solution = new Solution0020();
    }
    @Test
    public void test1() {
        final boolean result = solution.isValid("()");
        assertEquals(true, result);
    }
    @Test
    public void test2() {
        final boolean result = solution.isValid("()[]{}");
        assertEquals(true, result);
    }

    @Test
    public void test3() {
        final boolean result = solution.isValid("(}");
        assertEquals(false, result);
    }

    @Test
    public void test4() {
        final boolean result = solution.isValid("([)]");
        assertEquals(false, result);
    }

    @Test
    public void test5() {
        final boolean result = solution.isValid("){");
        assertEquals(false, result);
    }
}
