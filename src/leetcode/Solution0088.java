package leetcode;

/**
 * 示例 1：
 *
 * 输入：nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
 * 输出：[1,2,2,3,5,6]
 * 解释：需要合并 [1,2,3] 和 [2,5,6] 。
 * 合并结果是 [1,2,2,3,5,6] ，其中斜体加粗标注的为 nums1 中的元素。
 * 示例 2：
 *
 * 输入：nums1 = [1], m = 1, nums2 = [], n = 0
 * 输出：[1]
 * 解释：需要合并 [1] 和 [] 。
 * 合并结果是 [1] 。
 * 示例 3：
 *
 * 输入：nums1 = [0], m = 0, nums2 = [1], n = 1
 * 输出：[1]
 * 解释：需要合并的数组是 [] 和 [1] 。
 * 合并结果是 [1] 。
 * 注意，因为 m = 0 ，所以 nums1 中没有元素。nums1 中仅存的 0 仅仅是为了确保合并结果可以顺利存放到 nums1 中。
 */
public class Solution0088 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] num = new int[m + n];
        int l=0, r=0, i = 0;
        while (l < m && r < n) {
            num[i++] = nums1[l] > nums2[r] ? nums2[r++] : nums1[l++];
        }
        while (l < m) {
            num[i++] = nums1[l++];
        }
        while (r < n) {
            num[i++] = nums2[r++];
        }
        for (int j = 0; j < num.length; j++) {
            nums1[j] = num[j];
        }
    }

}