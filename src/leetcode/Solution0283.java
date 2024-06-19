package leetcode;


import java.util.LinkedList;
import java.util.Queue;

/**
 * 输入：heights = [2,1,5,6,2,3]
 * 输出：10
 * 解释：最大的矩形为图中红色区域，面积为 10
 *
 * 输入： heights = [2,4]
 * 输出： 4
 */
public class Solution0283 {
    public void moveZeroes(int[] nums) {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        for(int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                q1.add(nums[i]);
            } else {
                q2.add(nums[i]);
            }
        }
        int i = 0;
        while(!q2.isEmpty()) {
            nums[i++] = q2.poll();
        }
        while(!q1.isEmpty()) {
            nums[i++] = q1.poll();
        }
    }
    public void moveZeroes3(int[] nums) {
        int l =0, r = nums.length - 1;
        while(l < r) {
            if (nums[l] == 0) {
                while (nums[r] == 0 && l < r) {
                    r --;
                }
                nums[l] = nums[r];
                nums[r] = 0;
            } else {
                l ++;
            }
        }
    }
    public void moveZeroes2(int[] nums) {
        int l =0, r = nums.length - 1;
        while(l < r) {
            if (nums[l] == 0) {
                while (nums[r] == 0 && l < r) {
                    r --;
                }
                nums[l] = nums[r];
                nums[r] = 0;
            } else {
                l ++;
            }
        }
        quickSort(nums, 0, r - 1);
    }
    public void quickSort(int[] nums, int start, int end) {
        if (start > end) {
            return;
        }
        int flag = nums[start];
        int l = start , r = end;
        while(l < r) {
            while(nums[r] > flag && l < r) {
                r --;
            }
            if (l < r) {
                nums[l ++] = nums[r];
            }

            while(nums[l] < flag && l < r) {
                l ++;
            }
            if (l < r) {
                nums[r --] = nums[l];
            }
        }
        nums[l] = flag;
        quickSort(nums, start, l - 1);
        quickSort(nums, l + 1, end);
    }
}