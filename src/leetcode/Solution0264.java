package leetcode;


/**
 * 示例 1：
 *
 * 输入：n = 10
 * 输出：12
 * 解释：[1, 2, 3, 4, 5, 6, 8, 9, 10, 12] 是由前 10 个丑数组成的序列。
 * 示例 2：
 *
 * 输入：n = 1
 * 输出：1
 * 解释：1 通常被视为丑数。
 */
public class Solution0264 {
    public int nthUglyNumber(int n) {
        int[] result = new int[n + 1];
        result[0] = 0;
        result[1] = 1;
        int p2 = 1, p3 = 1, p5 = 1, i = 2;
        while (i <= n) {
            int r2 = result[p2] * 2;
            int r3 = result[p3] * 3;
            int r5 = result[p5] * 5;
            result[i] = Math.min(Math.min(r2, r3), r5);
            if (result[i] == r2) {
                p2++;
            }
            if (result[i] == r3) {
                p3++;
            }
            if (result[i] == r5) {
                p5++;
            }
            i++;
        }
        return result[n];
    }
}