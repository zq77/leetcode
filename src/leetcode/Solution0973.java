package leetcode;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 输入：points = [[1,3],[-2,2]], k = 1
 * 输出：[[-2,2]]
 * 解释：
 * (1, 3) 和原点之间的距离为 sqrt(10)，
 * (-2, 2) 和原点之间的距离为 sqrt(8)，
 * 由于 sqrt(8) < sqrt(10)，(-2, 2) 离原点更近。
 * 我们只需要距离原点最近的 K = 1 个点，所以答案就是 [[-2,2]]。
 *
 * 输入：points = [[3,3],[5,-1],[-2,4]], k = 2
 * 输出：[[3,3],[-2,4]]
 * （答案 [[-2,4],[3,3]] 也会被接受。）
 */
public class Solution0973 {
    public int[][] kClosest(int[][] points, int k) {
        if (points == null || points.length < 1) {
            return new int[0][0];
        }
        PriorityQueue<int[]> queue = new PriorityQueue<>(k, (o1, o2) -> {
            final int i = o1[0] * o1[0] + o1[1] * o1[1];
            final int j = o2[0] * o2[0] + o2[1] * o2[1];
            return j - i;
        });
        for (int i = 0; i < points.length; i++) {
            if (queue.size() < k) {
                queue.add(points[i]);
            } else {
                final int[] peek = queue.peek();
                final int count = peek[0] * peek[0] + peek[1] * peek[1];
                final int count2 = points[i][0] * points[i][0] + points[i][1] * points[i][1];
                if (count2 < count) {
                    queue.remove();
                    queue.add(points[i]);
                }
            }
        }
        return queue.stream().toList().toArray(new int[queue.size()][2]);
    }

    public int[][] kClosest2(int[][] points, int k) {
        if (points == null || points.length < 1) {
            return new int[0][0];
        }
        Map<Integer, List<int[]>> map = new HashMap<>();
        for (int i = 0; i < points.length; i++) {
            final int key = points[i][0] * points[i][0] + points[i][1] * points[i][1];
            List<int[]> list = map.computeIfAbsent(key, k1 -> new ArrayList<>());
            list.add(points[i]);
        }
        List<int[]> result = new ArrayList<>();
        map.keySet().stream().sorted(Integer::compareTo).forEach(key -> {
            if (result.size() == k) {
                return;
            }
            map.get(key).forEach(item -> {
                if (result.size() == k) {
                    return;
                }
                result.add(item);
            });
        });
        return result.toArray(new int[k][2]);
    }

}