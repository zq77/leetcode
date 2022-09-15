import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution0004Test {
    private Solution0004 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution0004();
    }

    @Test
    public void test1() {
        int[] nums1 = new int[]{1,3};
        int[] nums2 = new int[]{2};
        double result = solution.findMedianSortedArrays(nums1, nums2);
        assertEquals(2, result);
    }

    @Test
    public void test2() {
        int[] nums1 = new int[]{1,2};
        int[] nums2 = new int[]{3,4};
        double result = solution.findMedianSortedArrays(nums1, nums2);
        assertEquals(2.5, result);
    }

    @Test
    public void test3() {
        int[] nums1 = new int[]{1,3};
        int[] nums2 = new int[]{6,5,7};
        double result = solution.findMedianSortedArrays(nums1, nums2);
        assertEquals(5, result);
    }

    @Test
    public void test4() {
        int[] nums1 = new int[]{7,4};
        int[] nums2 = new int[]{6,5,7};
        double result = solution.findMedianSortedArrays(nums1, nums2);
        assertEquals(6, result);
    }

    @Test
    public void test5() {
        int[] nums1 = new int[]{7,4};
        int[] nums2 = new int[]{18,7};
        double result = solution.findMedianSortedArrays(nums1, nums2);
        assertEquals(7, result);
    }

    @Test
    public void test6() {
        int[] nums1 = new int[]{7,4};
        int[] nums2 = new int[]{};
        double result = solution.findMedianSortedArrays(nums1, nums2);
        assertEquals(5.5, result);
    }

    @Test
    public void test7() {
        int[] nums1 = new int[]{4};
        int[] nums2 = new int[]{};
        double result = solution.findMedianSortedArrays(nums1, nums2);
        assertEquals(4, result);
    }

    @Test
    public void test8() {
        int[] nums1 = new int[]{4};
        int[] nums2 = new int[]{8};
        double result = solution.findMedianSortedArrays(nums1, nums2);
        assertEquals(6, result);
    }

    @Test
    public void test9() {
        int[] nums1 = new int[]{0, 4};
        int[] nums2 = new int[]{8};
        double result = solution.findMedianSortedArrays(nums1, nums2);
        assertEquals(4, result);
    }

    @Test
    public void test10() {
        int[] nums1 = new int[]{0, 4};
        int[] nums2 = new int[]{8, 0};
        double result = solution.findMedianSortedArrays(nums1, nums2);
        assertEquals(2, result);
    }

    @Test
    public void test11() {
        int[] nums1 = new int[]{};
        int[] nums2 = new int[]{0, 4, 0};
        double result = solution.findMedianSortedArrays(nums1, nums2);
        assertEquals(0, result);
    }
}
