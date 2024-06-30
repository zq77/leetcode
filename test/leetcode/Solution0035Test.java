package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution0035Test {
    private Solution0035 solution;
    @BeforeEach
    void setUp() {
        solution = new Solution0035();
    }
    @Test
    public void test1() {
        final int result = solution.searchInsert(new int[] {1,3,5,6}, 5);
        assertEquals(2, result);
    }
    @Test
    public void test2() {
        final int result = solution.searchInsert(new int[] {1,3,5,6}, 2);
        assertEquals(1, result);
    }
    @Test
    public void test3() {
        final int result = solution.searchInsert(new int[] {1,3,5,6}, 7);
        assertEquals(4, result);
    }
}
