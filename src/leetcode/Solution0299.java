package leetcode;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 输入：secret = "1807", guess = "7810"
 * 输出："1A3B"
 * 解释：数字和位置都对（公牛）用 '|' 连接，数字猜对位置不对（奶牛）的采用斜体加粗标识。
 * "1807"
 *
 * 输入：secret = "1123", guess = "0111"
 * 输出："1A1B"
 * 解释：数字和位置都对（公牛）用 '|' 连接，数字猜对位置不对（奶牛）的采用斜体加粗标识。
 * "1123"        "1123"
 *   |      or     |
 * "0111"        "0111"
 * 注意，两个不匹配的 1 中，只有一个会算作奶牛（数字猜对位置不对）。通过重新排列非公牛数字，其中仅有一个 1 可以成为公牛数字。
 */
public class Solution0299 {
    public String getHint(String secret, String guess) {
        if (secret == null || guess == null) {
            return "0A0B";
        }
        final char[] charArray = secret.toCharArray();
        final char[] charArray2 = guess.toCharArray();
        Map<Character, int[]> map = new HashMap<>();
        int i =0;
        int a = 0;
        AtomicInteger b = new AtomicInteger();
        while (i < charArray.length && i < charArray2.length) {
            if (charArray[i] == charArray2[i]) {
                a ++;
            } else {
                int[] list1 = map.computeIfAbsent(charArray[i], k -> new int[2]);
                list1[0] += 1;
                int[] list2 = map.computeIfAbsent(charArray2[i], k -> new int[2]);
                list2[1] += 1;
            }
            i ++;
        }
        map.values().forEach(list -> {
            if (list[0] != 0 && list[1] != 0) {
                b.addAndGet(Math.min(list[0], list[1]));
            }
        });
        return a + "A" + b.get() + "B";
    }
}