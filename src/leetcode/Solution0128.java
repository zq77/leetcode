package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 示例 1：
 *
 * 输入：nums = [100,4,200,1,3,2]
 * 输出：4
 * 解释：最长数字连续序列是 [1, 2, 3, 4]。它的长度为 4。
 *
 * 示例 2：
 *
 * 输入：nums = [0,3,7,2,5,8,4,6,0,1]
 * 输出：9
 */
public class Solution0128 {

    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length < 1) {
            return 0;
        }
        final Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        int max = 1;
        for (Integer num : set) {
            if (!set.contains(num - 1)) {
                int currentNum = num;
                while (set.contains(currentNum + 1)) {
                    currentNum = currentNum + 1;
                    max = Math.max(max, currentNum - num + 1);
                }
            }
        }
        return max;
    }

    public int longestConsecutive2(int[] nums) {
        if (nums == null || nums.length < 1) {
            return 0;
        }
//        int[] sorted = mergeSort(nums, 0, nums.length - 1); // 42ms
        int[] sorted = Arrays.stream(nums).sorted().distinct().toArray(); // 28ms
        int max = 1;
        boolean isEnd = false;
        for (int i = 0; i < sorted.length; i++) {
            for (int j = i + 1; j < sorted.length; j++) {
                if (sorted[j] - 1 != sorted[j - 1]){
                    max = Math.max(j - i, max);
                    if (j == sorted.length - 1) {
                        isEnd = true;
                    }
                    break;
                } else {
                    max = Math.max(j - i +1, max);
                    if (j == sorted.length - 1) {
                        isEnd = true;
                    }
                }
            }
            if (isEnd) {
                break;
            }
        }
        return max;
    }

    private int[] mergeSort(int[] nums, int start, int end) {
        if (start == end) {
            return new int[]{nums[start]};
        }
        int mid = start + (end - start) / 2;
        int[] leftArr = mergeSort(nums, start, mid);
        int[] rightArr = mergeSort(nums, mid + 1, end);
        int[] result = new int[leftArr.length + rightArr.length];
        int l = 0, r = 0, i = 0;
        while (l < leftArr.length && r < rightArr.length) {
            result[i++] = leftArr[l] > rightArr[r] ? rightArr[r++] : leftArr[l++];
        }
        while (l < leftArr.length) {
            result[i ++] = leftArr[l++];
        }
        while (r < rightArr.length) {
            result[i ++] = rightArr[r++];
        }
        return result;
    }

}
