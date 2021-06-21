import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 */
public class Solution0001 {

  public int[] twoSum(int[] nums, int target) {
    int[] index = new int[2];
    Map<Integer, Integer> record = new HashMap<>();
    for (int i = 0; i < nums.length; i ++) {
      int complement = target - nums[i];
      Integer oneIndex = record.get(complement);
      if (oneIndex != null) {
        index[0] = oneIndex;
        index[1] = i;
        break;
      }
      record.put(nums[i], i);
    }
    return index;
  }
}
