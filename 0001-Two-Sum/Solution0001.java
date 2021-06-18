import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 */
public class Solution0001 {
  public static int[] twoSum(int[] nums, int target) {
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

  public static void main( String[] args ) {
    int[] nums = {2,7,11,15};
    int target = 9;
    int[] result = twoSum( nums, target );
    System.out.println(Arrays.equals( result, new int[]{ 0, 1 } ));

    nums = new int[]{3, 2, 4};
    target = 6;
    result = twoSum( nums, target );
    System.out.println(Arrays.equals( result, new int[]{ 1, 2 } ));

    nums = new int[]{3, 3};
    target = 6;
    result = twoSum( nums, target );
    System.out.println(Arrays.equals( result, new int[]{ 0, 1 } ));

    nums = new int[]{15, 2, 11, 7};
    target = 9;
    result = twoSum( nums, target );
    System.out.println(Arrays.equals( result, new int[]{ 1, 3 } ));
  }
}
