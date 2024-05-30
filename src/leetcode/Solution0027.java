package leetcode;


/**
 * 示例 1：
 *
 * 输入：nums = [3,2,2,3], val = 3
 * 输出：2, nums = [2,2,_,_]
 * 解释：你的函数函数应该返回 k = 2, 并且 nums 中的前两个元素均为 2。
 * 示例 2：
 *
 * 输入：nums = [0,1,2,2,3,0,4,2], val = 2
 * 输出：5, nums = [0,1,4,0,3,_,_,_]
 * 解释：你的函数应该返回 k = 5，并且 nums 中的前五个元素为 0,0,1,3,4。
 */
public class Solution0027 {
    public int removeElement(int[] nums, int val) {
        int[] newArr = new int[nums.length];
        int i = 0, j = 0;
        while (i < nums.length) {
            if (nums[i] != val) {
                newArr[j] = nums[i];
                j++;
            }
            i ++;
        }
        for (int k = 0; k < newArr.length; k++) {
            nums[k] = newArr[k];
        }
        return j;
    }

}