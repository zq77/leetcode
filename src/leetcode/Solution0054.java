package leetcode;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 示例 1：
 * 输入：matrix = [[1,2,3],[4,5,6],[7,8,9]]
 * 输出：[1,2,3,6,9,8,7,4,5]
 *
 * 示例 2：
 * 输入：matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
 * 输出：[1,2,3,4,8,12,11,10,9,5,6,7]
 */
public class Solution0054 {
    public List<Integer> spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return Collections.emptyList();
        }
        List<Integer> list = new ArrayList<>();
        int top = 0, bottom = matrix.length - 1, left = 0, right = matrix[0].length - 1;
        while (top <= bottom && left <= right) {
            // ->
            for (int i = left; i <= right; i++) {
                list.add(matrix[top][i]);
            }
            // |
            for (int i = top + 1; i <= bottom; i++) {
                list.add(matrix[i][right]);
            }
            if (left < right && top < bottom) {
                // <-
                for (int i = right - 1; i >= left; i--) {
                    list.add(matrix[bottom][i]);
                }
                // |
                for (int i = bottom - 1; i > top; i--) {
                    list.add(matrix[i][left]);
                }
            }
            top ++;
            bottom --;
            left ++;
            right --;
        }
        return list;
    }
}