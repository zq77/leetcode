package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution0056Test {

    private Solution0056 solution;

    @BeforeEach
    private void setup() {
        solution = new Solution0056();
    }

    @Test
    public void test1() {
        int[][] nums = new int[][]{{1,3}, {2,6}, {8,10}, {15,18}};
        final int[][] result = solution.merge(nums);
        assertEquals("[[1, 6], [8, 10], [15, 18]]", Arrays.deepToString(result));
    }

    @Test
    public void test2() {
        int[][] nums = new int[][]{{1,4}, {4,5}};
        final int[][] result = solution.merge(nums);
        assertEquals("[[1, 5]]", Arrays.deepToString(result));
    }
    @Test
    public void test3() {
        int[][] nums = new int[][]{{2,6}, {1,3}, {8,10}, {15,18}};
        final int[][] result = solution.merge(nums);
        assertEquals("[[1, 6], [8, 10], [15, 18]]", Arrays.deepToString(result));
    }
    @Test
    public void test4() {
        int[][] nums = new int[][]{{1, 4}, {2,3}};
        final int[][] result = solution.merge(nums);
        assertEquals("[[1, 4]]", Arrays.deepToString(result));
    }
    @Test
    public void test5() {
        int[][] nums = new int[][]{{1, 4}, {0, 2}, {3, 5}};
        final int[][] result = solution.merge(nums);
        assertEquals("[[0, 5]]", Arrays.deepToString(result));
    }

    @Test
    public void test6() {
        int[][] nums = new int[][]{{2, 6}, {4, 6}, {4, 5}, {2, 2}};
        final int[][] result = solution.merge(nums);
        assertEquals("[[2, 6]]", Arrays.deepToString(result));
    }
}