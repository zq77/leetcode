package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution0054Test {

    private Solution0054 solution;

    @BeforeEach
    private void setup() {
        solution = new Solution0054();
    }

    @Test
    public void test1() {
        int[][] nums = new int[][]{{1, 2,3}, {4,5,6}, {7,8,9}};
        final List<Integer> result = solution.spiralOrder(nums);
        assertEquals("[1, 2, 3, 6, 9, 8, 7, 4, 5]", Arrays.toString(result.toArray()));
    }

    @Test
    public void test2() {
        int[][] nums = new int[][]{{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
        final List<Integer> result = solution.spiralOrder(nums);
        assertEquals("[1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7]", Arrays.toString(result.toArray()));
    }

    @Test
    public void test3() {
        int[][] nums = new int[][]{{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
        final List<Integer> result = solution.spiralOrder(nums);
        assertEquals("[1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10]", Arrays.toString(result.toArray()));
    }
}