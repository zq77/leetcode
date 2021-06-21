import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Given a string s, find the length of the longest substring without repeating characters.
 */
public class Solution0003 {

    /**
     * 维护一个charRecordSet用来记录当前字符串有没有重复，
     * 从l = 0, r = 0开始循环，每次使 r 自增，当遇到重复的字符，就把l ++ 的index赋值给r 重新循环
     */
    public int lengthOfLongestSubstring(String s) {
        Set<Character> charRecordSet = new HashSet<>();
        char[] chars = s.toCharArray();
        int l = 0, r = 0, result = 0;
        while (l < chars.length) {
            if (r < chars.length && !charRecordSet.contains(chars[r])) {
                result = Math.max(result, r - l + 1);
                charRecordSet.add(chars[r]);
                r ++;
            } else {
                charRecordSet.clear();
                l ++;
                r = l;
            }
        }
        return result;
    }

    /**
     * can get all substring
     */
    public int lengthOfLongestSubstring2(String s) {
        List<String> noRepeatStrList = new ArrayList<>();
        char[] chars = s.toCharArray();
        for (int i=0; i < chars.length; i++) {
            if (noRepeatStrList.isEmpty()) {
                noRepeatStrList.add(String.valueOf(chars[i]));
            } else if (noRepeatStrList.get(noRepeatStrList.size() - 1).contains(String.valueOf(chars[i]))) {
                String newStr = String.valueOf(chars[i]);
                for (int j = i - 1; j >= 1; j --) {
                    if (chars[i] == chars[j] ) {
                        break;
                    }
                    newStr = chars[j] + newStr;
                }
                noRepeatStrList.add(newStr);
            } else {
                String newStr = noRepeatStrList.get(noRepeatStrList.size() - 1) + chars[i];
                noRepeatStrList.set(noRepeatStrList.size() - 1, newStr);
            }
        }
        return noRepeatStrList.stream().mapToInt(String::length).max().orElse(0);
    }
}
