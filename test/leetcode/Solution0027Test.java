package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution0027Test {

    private Solution0027 solution;

    @BeforeEach
    private void setup() {
        solution = new Solution0027();
    }

    @Test
    public void test1() {
        int[] nums = new int[]{3, 2,2,3};
        final int result = solution.removeElement(nums, 3);
        assertEquals(2, result);
    }

    @Test
    public void test2() {
        int[] nums = new int[]{0,1,2,2,3,0,4,2};
        final int result = solution.removeElement(nums, 2);
        assertEquals(5, result);
    }
}