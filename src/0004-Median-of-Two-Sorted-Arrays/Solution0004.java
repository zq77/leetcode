import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
 * The overall run time complexity should be O(log (m+n)).
 * <p>
 * Example 1:
 * Input: nums1 = [1,3], nums2 = [2]
 * Output: 2.00000
 * Explanation: merged array = [1,2,3] and median is 2.
 * <p>
 * Example 2:
 * Input: nums1 = [1,2], nums2 = [3,4]
 * Output: 2.50000
 * Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 * <p>
 * Constraints:
 * nums1.length == m
 * nums2.length == n
 * 0 <= m <= 1000
 * 0 <= n <= 1000
 * 1 <= m + n <= 2000
 * -106 <= nums1[i], nums2[i] <= 106
 */
public class Solution0004 {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merge = new int[nums1.length + nums2.length];
        int length = Math.max(nums1.length, nums2.length);
        int flag = 0;
        for (int i = 0; i < length; i++) {
            if (i < nums1.length) {
                sortMergedArray(nums1, merge, flag, i);
                flag ++;
            }
            if (i < nums2.length) {
                sortMergedArray(nums2, merge, flag, i);
                flag ++;
            }
        }
        int totalLen = merge.length;
        if (totalLen % 2 == 0) {
            return (double) (merge[totalLen / 2] + merge[(totalLen / 2) - 1]) / 2;
        } else {
            return merge[(totalLen / 2)];
        }
    }

    private static void sortMergedArray(int[] nums1, int[] merge, int flag, int i) {
        if (flag == 0) {
            merge[flag] = nums1[i];
        } else if (merge[flag - 1] <= nums1[i]) {
            merge[flag] = nums1[i];
        } else {
            for (int j = flag - 1; j >= 0; j--) {
                if (merge[j] > nums1[i]) {
                    merge[j + 1] = merge[j];
                    merge[j] = nums1[i];
                } else {
                    break;
                }
            }
        }
    }

    public double findMedianSortedArrays2(int[] nums1, int[] nums2) {
        int totalLength = nums1.length + nums2.length;
        int[] medianIndex = new int[2];
        medianIndex[0] = totalLength / 2;
        if (totalLength % 2 == 0) {
            medianIndex[1] = medianIndex[0] + 1;
        } else {
            medianIndex[0] = medianIndex[0] + 1;
        }
        List<Integer> merge = new ArrayList<>();
        merge.addAll(Arrays.stream(nums1).boxed().collect(Collectors.toList()));
        merge.addAll(Arrays.stream(nums2).boxed().collect(Collectors.toList()));
        merge.sort(Integer::compareTo);
        int result = merge.get(medianIndex[0] - 1);
        if (medianIndex[1] != 0) {
            return (double) (result + merge.get(medianIndex[1] - 1)) / 2;
        }
        return result;
    }

}
