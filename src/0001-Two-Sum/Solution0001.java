import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

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

    public static void main(String[] args) {
        int[] arr = new int[]{4,19,14,5,-3,1,8,5,11,15};
        int[] newArr = mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.stream(newArr).boxed().collect(Collectors.toList()));
    }

    private static int[] mergeSort(int[] arr, int left, int right) {
        if (left == right) {
            return new int[]{arr[left]};
        }
        int mid = left + (right - left) / 2;
        int[] leftArr = mergeSort(arr, left, mid);
        int[] rightArr = mergeSort(arr, mid+1, right);
        int[] newArray = new int[leftArr.length + rightArr.length];
        int m = 0, l = 0, r = 0;
        while (l < leftArr.length && r < rightArr.length) {
            newArray[m++] = leftArr[l] > rightArr[r] ? rightArr[r++] : leftArr[l++];
        }
        while (l < leftArr.length) {
            newArray[m++] = leftArr[l++];
        }
        while (r < rightArr.length) {
            newArray[m++] = rightArr[r++];
        }
        return newArray;
    }
}
