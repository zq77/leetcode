package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution0347Test {
    private Solution0347 solution;
    @BeforeEach
    void setUp() {
        solution = new Solution0347();
    }
    @Test
    public void test1() {
        final int[] result = solution.topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2);
        Arrays.sort(result);
        assertEquals("[1, 2]", Arrays.toString(result));
    }
    @Test
    public void test2() {
        final int[] result = solution.topKFrequent(new int[]{1}, 1);
        Arrays.sort(result);
        assertEquals("[1]", Arrays.toString(result));
    }
    @Test
    public void test3() {
        final int[] result = solution.topKFrequent(new int[]{4,1,-1,2,-1,2,3}, 2);
        Arrays.sort(result);
        assertEquals("[-1, 2]", Arrays.toString(result));
    }
}
