package leetcode;

import java.util.PriorityQueue;

/**
 * 示例 1:
 *
 * 输入: [3,2,1,5,6,4], k = 2
 * 输出: 5
 * 示例 2:
 *
 * 输入: [3,2,3,1,2,4,5,5,6], k = 4
 * 输出: 4
 */
public class Solution0215 {

    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(k, Integer::compareTo);
        for(Integer n : nums) {
            if (queue.size() == k) {
                if (queue.peek() < n) {
                    queue.remove();
                } else {
                    continue;
                }
            }
            queue.add(n);
        }
        return queue.peek();
    }

}
