package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution0013Test {

    private Solution0013 solution;

    @BeforeEach
    private void setup() {
        solution = new Solution0013();
    }

    @Test
    public void test1() {
        final int s = solution.romanToInt("MMMDCCXLIX");
        assertEquals(3749, s);
    }

    @Test
    public void test2() {
        final int s = solution.romanToInt("LVIII");
        assertEquals(58, s);
    }

    @Test
    public void test3() {
        final int s = solution.romanToInt("MCMXCIV");
        assertEquals(1994, s);
    }

    @Test
    public void test4() {
        final int s = solution.romanToInt("III");
        assertEquals(3, s);
    }

    @Test
    public void test5() {
        final int s = solution.romanToInt("IV");
        assertEquals(4, s);
    }

    @Test
    public void test6() {
        final int s = solution.romanToInt("LVIII");
        assertEquals(58, s);
    }

    @Test
    public void test7() {
        final int s = solution.romanToInt("MCMXCIV");
        assertEquals(1994, s);
    }
}