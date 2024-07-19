package leetcode;


import common.ListNode;

import java.util.LinkedHashSet;
import java.util.Set;

public class Solution0026 {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new LinkedHashSet<>();
        int i = 0, j = 0;
        while(i < nums.length) {
            if (set.add(nums[i])) {
                nums[j++] = nums[i];
            }
            i ++;
        }
        return set.size();
    }
}