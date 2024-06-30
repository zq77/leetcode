package leetcode;

import common.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 示例 1:
 *
 * 输入: nums = [1,3,5,6], target = 5
 * 输出: 2
 * 示例 2:
 *
 * 输入: nums = [1,3,5,6], target = 2
 * 输出: 1
 * 示例 3:
 *
 * 输入: nums = [1,3,5,6], target = 7
 * 输出: 4
 */
public class Solution0035 {
    public int searchInsert(int[] nums, int target) {
        if (nums == null || nums.length < 1 || nums[0] >= target) {
            return 0;
        }
        int mid = nums.length / 2, start = 0, end = nums.length;
        while(mid >=0 && mid < nums.length) {
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] > target) {
                end = mid;
            } else {
                start = mid;
            }
            if(start >= end) {
                break;
            }
            mid = start + (end - start) / 2;
            if (start == mid || end == mid) {
                break;
            }
        }
        return mid + 1;
    }
}
