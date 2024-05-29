package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution0012Test {

    private Solution0012 solution;

    @BeforeEach
    private void setup() {
        solution = new Solution0012();
    }

    @Test
    public void test1() {
        final String s = solution.intToRoman(3749);
        assertEquals("MMMDCCXLIX", s);
    }

    @Test
    public void test2() {
        final String s = solution.intToRoman(58);
        assertEquals("LVIII", s);
    }

    @Test
    public void test3() {
        final String s = solution.intToRoman(1994);
        assertEquals("MCMXCIV", s);
    }
}