import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api .Assertions.assertArrayEquals;

class Solution0001Test {
    private Solution0001 solution;

    @BeforeEach
    public void setUp() {
        solution = new Solution0001();
    }

    @Test
    public void test1() {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] result = solution.twoSum( nums, target );
        assertArrayEquals(new int[]{ 0, 1 }, result);
    }

    @Test
    public void test2() {
        int[] nums = new int[]{3, 2, 4};
        int target = 6;
        int[] result = solution.twoSum( nums, target );
        assertArrayEquals(new int[]{ 1, 2 }, result);
    }

    @Test
    public void test3() {
        int[] nums = new int[]{3, 3};
        int target = 6;
        int[] result = solution.twoSum( nums, target );
        assertArrayEquals(new int[]{ 0, 1 }, result);
    }

    @Test
    public void test4() {
        int[] nums = new int[]{15, 2, 11, 7};
        int target = 9;
        int[] result = solution.twoSum( nums, target );
        assertArrayEquals(new int[]{ 1, 3 }, result);
    }

    @Test
    public void test5() {
        int[] nums = new int[]{15, 3, 11, 7};
        int target = 9;
        int[] result = solution.twoSum( nums, target );
        assertArrayEquals(new int[2], result);
    }

    @Test
    public void test6() {
        int[] nums = new int[]{15, 2, 11, 3, 7};
        int target = 9;
        int[] result = solution.twoSum( nums, target );
        assertArrayEquals(new int[]{ 1, 4 }, result);
    }
}