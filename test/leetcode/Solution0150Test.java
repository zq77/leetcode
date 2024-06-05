package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution0150Test {
    private Solution0150 solution;
    @BeforeEach
    void setUp() {
        solution = new Solution0150();
    }
    @Test
    public void test1() {
        final int result = solution.evalRPN(new String[]{"2", "1", "+", "3", "*"});
        assertEquals(9, result);
    }
    @Test
    public void test2() {
        final int result = solution.evalRPN(new String[]{"4","13","5","/","+"});
        assertEquals(6, result);
    }

    @Test
    public void test3() {
        final int result = solution.evalRPN(new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"});
        assertEquals(22, result);
    }
}
