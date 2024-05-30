package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution0075Test {

    private Solution0075 solution;

    @BeforeEach
    private void setup() {
        solution = new Solution0075();
    }

    @Test
    public void test1() {
        int[] nums = new int[]{2,0,2,1,1,0};
        solution.sortColors(nums);
        assertEquals("[0, 0, 1, 1, 2, 2]", Arrays.toString(nums));
    }

    @Test
    public void test2() {
        int[] nums = new int[]{2,0,1};
        solution.sortColors(nums);
        assertEquals("[0, 1, 2]", Arrays.toString(nums));
    }
    @Test
    public void test3() {
        int[] nums = new int[]{2,1,0};
        solution.sortColors(nums);
        assertEquals("[0, 1, 2]", Arrays.toString(nums));
    }
}