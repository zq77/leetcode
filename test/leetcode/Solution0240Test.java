package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Solution0240Test {
    private Solution0240 solution;
    @BeforeEach
    void setUp() {
        solution = new Solution0240();
    }
    @Test
    public void test1() {
        final boolean s = solution.searchMatrix(new int[][]{{1,4,7,11,15}, {2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}}, 20);
        assertFalse(s);
    }
    @Test
    public void test2() {
        final boolean s = solution.searchMatrix(new int[][]{{1,4,7,11,15}, {2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}}, 5);
        assertTrue(s);
    }
    @Test
    public void test3() {
        final boolean s = solution.searchMatrix(new int[][]{{-1, 3}}, -1);
        assertTrue(s);
    }
    @Test
    public void test4() {
        final boolean s = solution.searchMatrix(new int[][]{{5}, {6}}, 5);
        assertTrue(s);
    }
    @Test
    public void test5() {
        final boolean s = solution.searchMatrix(new int[][]{{1,2,3,4,5}, {6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}, {21,22,23,24,25}}, 5);
        assertTrue(s);
    }
}
