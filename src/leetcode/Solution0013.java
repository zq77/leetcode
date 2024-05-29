package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 示例 1:
 *
 * 输入: s = "III"
 * 输出: 3
 * 示例 2:
 *
 * 输入: s = "IV"
 * 输出: 4
 * 示例 3:
 *
 * 输入: s = "IX"
 * 输出: 9
 * 示例 4:
 *
 * 输入: s = "LVIII"
 * 输出: 58
 * 解释: L = 50, V= 5, III = 3.
 * 示例 5:
 *
 * 输入: s = "MCMXCIV"
 * 输出: 1994
 * 解释: M = 1000, CM = 900, XC = 90, IV = 4.
 */
public class Solution0013 {

    public int romanToInt(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        final char[] charArray = s.toCharArray();
        int result = 0;
        for (int i = 0; i < charArray.length; i++) {
            final Integer cur = map.get(charArray[i]);
            if (i == charArray.length - 1) {
                result += cur;
                break;
            }
            final Integer next = map.get(charArray[i + 1]);
            if (next > cur) {
                result += (next - cur);
                i = i + 1;
            } else {
                result += cur;
            }
        }
        return result;
    }

}
