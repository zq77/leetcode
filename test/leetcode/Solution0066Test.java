package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution0066Test {
    private Solution0066 solution;
    @BeforeEach
    void setUp() {
        solution = new Solution0066();
    }
    @Test
    public void test1() {
        final int[] ints = solution.plusOne(new int[]{1, 2, 3});
        assertEquals("[1, 2, 4]", Arrays.toString(ints));
    }
    @Test
    public void test2() {
        final int[] ints = solution.plusOne(new int[]{9,8,7,6,5,4,3,2,1,0});
        assertEquals("[9, 8, 7, 6, 5, 4, 3, 2, 1, 1]", Arrays.toString(ints));
    }
    @Test
    public void test3() {
        final int[] ints = solution.plusOne(new int[]{7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6});
        assertEquals("[7, 2, 8, 5, 0, 9, 1, 2, 9, 5, 3, 6, 6, 7, 3, 2, 8, 4, 3, 7, 9, 5, 7, 7, 4, 7, 4, 9, 4, 7, 0, 1, 1, 1, 7, 4, 0, 0, 7]", Arrays.toString(ints));
    }
}
