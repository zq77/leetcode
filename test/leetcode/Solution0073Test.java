package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution0073Test {
    private Solution0073 solution;
    @BeforeEach
    void setUp() {
        solution = new Solution0073();
    }
    @Test
    public void test1() {
        int[][] matrix = new int[][]{{1,1,1},{1,0,1},{1,1,1}};
        solution.setZeroes(matrix);
        assertEquals("[[1, 0, 1], [0, 0, 0], [1, 0, 1]]", Arrays.deepToString(matrix));
    }
    @Test
    public void test2() {
        int[][] matrix = new int[][]{{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        solution.setZeroes(matrix);
        assertEquals("[[0, 0, 0, 0], [0, 4, 5, 0], [0, 3, 1, 0]]", Arrays.deepToString(matrix));
    }
}
