package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution0350Test {
    private Solution0350 solution;
    @BeforeEach
    void setUp() {
        solution = new Solution0350();
    }
    @Test
    public void test1() {
        final int[] result = solution.intersect(new int[]{1, 2, 2, 1}, new int[]{2, 2});
        assertEquals("[2, 2]", Arrays.toString(result));
    }
    @Test
    public void test2() {
        final int[] result = solution.intersect(new int[]{4,9,5}, new int[]{9,4,9,8,4});
        assertEquals("[4, 9]", Arrays.toString(result));
    }
}
