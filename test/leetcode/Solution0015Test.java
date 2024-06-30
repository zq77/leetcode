package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution0015Test {
    private Solution0015 solution;
    @BeforeEach
    void setUp() {
        solution = new Solution0015();
    }
    @Test
    public void test1() {
        final List<List<Integer>> result = solution.threeSum(new int[]{-1, 0, 1, 2, -1, -4});
        assertEquals("[[-1, -1, 2], [-1, 0, 1]]", result.toString());
    }
    @Test
    public void test2() {
        final List<List<Integer>> result = solution.threeSum(new int[]{0,1,1});
        assertEquals("[]", result.toString());
    }
    @Test
    public void test3() {
        final List<List<Integer>> result = solution.threeSum(new int[]{0,0,0});
        assertEquals("[[0, 0, 0]]", result.toString());
    }
    @Test
    public void test4() {
        final List<List<Integer>> result = solution.threeSum(new int[]{-2,0,0,2,2});
        assertEquals("[[-2, 0, 2]]", result.toString());
    }
    @Test
    public void test5() {
        final List<List<Integer>> result = solution.threeSum(new int[]{-2,0,1,1,2});
        assertEquals("[[-2, 0, 2], [-2, 1, 1]]", result.toString());
    }
}
