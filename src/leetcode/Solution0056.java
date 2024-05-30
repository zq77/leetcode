package leetcode;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 示例 1：
 *
 * 输入：intervals = [[1,3],[2,6],[8,10],[15,18]]
 * 输出：[[1,6],[8,10],[15,18]]
 * 解释：区间 [1,3] 和 [2,6] 重叠, 将它们合并为 [1,6].
 * 示例 2：
 *
 * 输入：intervals = [[1,4],[4,5]]
 * 输出：[[1,5]]
 * 解释：区间 [1,4] 和 [4,5] 可被视为重叠区间。
 */
public class Solution0056 {
    public int[][] merge(int[][] intervals) {
        if (intervals.length < 1) {
            return intervals;
        }
        quickSort(intervals, 0, intervals.length - 1);
        List<int[]> result = new ArrayList<>();
        result.add(intervals[0]);
        for (int i = 1; i < intervals.length; i++) {
            final int left = intervals[i][0];
            final int right = intervals[i][1];

            final int[] cur = result.get(result.size() - 1);
            if (cur[1] < left) {
                result.add(intervals[i]);
            } else {
                cur[0] = Math.min(cur[0], left);
                cur[1] = Math.max(cur[1], right);
            }

        }
        return result.toArray(new int[][]{});
    }

    private void quickSort(int[][] intervals, int start, int end) {
        if (start > end) {
            return;
        }
        int flag = intervals[start][0];
        int flag2 = intervals[start][1];
        int l = start, r = end;
        while (l < r) {
            while (intervals[r][0] >= flag && l < r) {
                r --;
            }
            intervals[l][0] = intervals[r][0];
            intervals[l][1] = intervals[r][1];
            while (intervals[l][0] <= flag && l < r) {
                l ++;
            }
            intervals[r][0] = intervals[l][0];
            intervals[r][1] = intervals[l][1];
        }
        intervals[l][0] = flag;
        intervals[l][1] = flag2;
        quickSort(intervals, start, l - 1);
        quickSort(intervals, r + 1, end);
    }

}