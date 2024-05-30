package leetcode;


import java.util.Arrays;

/**
 * 示例 1：
 *
 * 输入：nums = [2,0,2,1,1,0]
 * 输出：[0,0,1,1,2,2]
 * 示例 2：
 *
 * 输入：nums = [2,0,1]
 * 输出：[0,1,2]
 */
public class Solution0075 {
    public void sortColors(int[] nums) {
        int[] newNums = sortColors(nums, 0, nums.length - 1);
        for (int i = 0; i < newNums.length; i++) {
            nums[i] = newNums[i];
        }
    }

    private int[] sortColors(int[] nums, int start, int end) {
        if (start == end) {
            return new int[]{nums[start]};
        }
        int mid = start + (end-start)/2;
        final int[] leftArr = sortColors(nums, start, mid);
        final int[] rightArr = sortColors(nums, mid + 1, end);
        int[] newArray = new int[leftArr.length + rightArr.length];
        int l = 0, r = 0, i = 0;
        while (l < leftArr.length && r < rightArr.length) {
            newArray[i++] = leftArr[l] > rightArr[r] ? rightArr[r++] : leftArr[l ++];
        }
        while (l < leftArr.length) {
            newArray[i++] = leftArr[l++];
        }
        while (r < rightArr.length) {
            newArray[i++] = rightArr[r++];
        }
        return newArray;
    }
    public void sortColors2(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            for (int j = i; j > 0; j--) {
                if (nums[j] < nums[j - 1]) {
                    final int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                }
            }
        }
    }
}