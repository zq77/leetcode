package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution0973Test {
    private Solution0973 solution;
    @BeforeEach
    void setUp() {
        solution = new Solution0973();
    }
    @Test
    public void test1() {
        final int[][] result = solution.kClosest(new int[][]{{1,3},{-2,2}}, 1);
        assertEquals("[[-2, 2]]", Arrays.deepToString(result));
    }
    @Test
    public void test2() {
        final int[][] result = solution.kClosest(new int[][]{{3,3},{5,-1},{-2,4}}, 2);
        assertEquals("[[-2, 4], [3, 3]]", Arrays.deepToString(result));
    }
}
