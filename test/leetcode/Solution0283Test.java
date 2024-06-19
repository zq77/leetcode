package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution0283Test {
    private Solution0283 solution;
    @BeforeEach
    void setUp() {
        solution = new Solution0283();
    }
    @Test
    public void test1() {
        int[] strs = new int[]{0,1,0,3,12};
        solution.moveZeroes(strs);
        assertEquals("[1, 3, 12, 0, 0]", Arrays.toString(strs));
    }
    @Test
    public void test2() {
        int[] strs = new int[]{4,2,4,0,0,3,0,5,1,0};
        solution.moveZeroes(strs);
        assertEquals("[1, 2, 3, 4, 4, 5, 0, 0, 0, 0]", Arrays.toString(strs));
    }
}
