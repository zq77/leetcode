package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 示例 1：
 *
 * 输入：nums1 = [1,2,2,1], nums2 = [2,2]
 * 输出：[2,2]
 * 示例 2:
 *
 * 输入：nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * 输出：[4,9]
 */
public class Solution0350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int[] result = new int[Math.min(nums1.length, nums2.length)];
        int i = 0, j = 0, index = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] > nums2[j]) {
                j ++;
            } else if (nums1[i] < nums2[j]) {
                i ++;
            } else {
                result[index++] = nums1[i];
                i ++;
                j ++;
            }
        }
        return Arrays.copyOfRange(result, 0, index);
    }
}
