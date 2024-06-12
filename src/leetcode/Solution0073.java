package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 示例 1：
 *
 * 输入：matrix = [[1,1,1],[1,0,1],[1,1,1]]
 * 输出：[[1,0,1],[0,0,0],[1,0,1]]
 *
 * 示例 2：
 *
 * 输入：matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
 * 输出：[[0,0,0,0],[0,4,5,0],[0,3,1,0]]
 */
public class Solution0073 {
    public void setZeroes(int[][] matrix) {
        if (matrix == null || matrix.length < 1) {
            return;
        }
        final int rowLength = matrix.length;
        final int columnLength = matrix[0].length;
        int[] rows = new int[rowLength];
        int[] columns = new int[columnLength];
        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < columnLength; j++) {
                if (matrix[i][j] == 0) {
                    rows[i] = 1;
                    columns[j] = 1;
                }
            }
        }
        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < columnLength; j++) {
                if (rows[i] == 1 || columns[j] == 1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public void setZeroes2(int[][] matrix) {
        if (matrix == null) {
            return;
        }
        HashSet<Integer> xSet = new HashSet<>();
        HashSet<Integer> ySet = new HashSet<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    xSet.add(i);
                    ySet.add(j);
                }
            }
        }
        xSet.forEach(x -> {
            for (int i = 0; i < matrix[0].length; i++) {
                matrix[x][i] = 0;
            }
        });
        ySet.forEach(y -> {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][y] = 0;
            }
        });
    }
}
