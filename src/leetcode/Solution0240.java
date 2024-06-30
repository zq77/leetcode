package leetcode;


import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * 示例 1:
 *
 * 输入：matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], target = 5
 * 输出：true
 *
 * 示例 2:
 *
 * 输入：matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], target = 20
 * 输出：false
 */
public class Solution0240 {
    public boolean searchMatrix(int[][] matrix, int target) {
        return find(matrix, target, matrix.length - 1, 0, matrix[0].length - 1);
//        int rowLen = matrix.length;
//        int colLen = matrix[0].length;
//        int colMid = colLen / 2;
//        int rowMid = rowLen / 2;
//        if (target == matrix[rowMid][colMid]) {
//            return true;
//        }
//        if (target > matrix[rowMid][colMid]) {
//            return find(matrix, target, rowLen - 1, colMid, colLen - 1);
//
//        } else {
//            return find(matrix, target, rowMid, 0, colMid);
//        }
    }
    private boolean find(int[][] matrix, int target, int rowEnd, int left, int right) {
        for(int i = 0; i <= rowEnd; i ++) {
            int l = left, r = right;
            while(l <= r) {
                int mid = (r - l) / 2 + l;
                if (target == matrix[i][mid]) {
                    return true;
                }
                if (target > matrix[i][mid]) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }
        }
        return false;
    }
}