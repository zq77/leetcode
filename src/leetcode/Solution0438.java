package leetcode;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * 示例 1:
 *
 * 输入: s = "cbaebabacd", p = "abc"
 * 输出: [0,6]
 * 解释:
 * 起始索引等于 0 的子串是 "cba", 它是 "abc" 的异位词。
 * 起始索引等于 6 的子串是 "bac", 它是 "abc" 的异位词。
 *  示例 2:
 *
 * 输入: s = "abab", p = "ab"
 * 输出: [0,1,2]
 * 解释:
 * 起始索引等于 0 的子串是 "ab", 它是 "ab" 的异位词。
 * 起始索引等于 1 的子串是 "ba", 它是 "ab" 的异位词。
 * 起始索引等于 2 的子串是 "ab", 它是 "ab" 的异位词。
 */
public class Solution0438 {

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        if (s.length() < p.length()) {
            return list;
        }
        int[] sArr = new int[26];
        int[] pArr = new int[26];
        for (int i = 0; i < p.length(); i ++) {
            sArr[s.charAt(i) - 'a'] += 1;
            pArr[p.charAt(i) - 'a'] += 1;
        }
        if (Arrays.equals(sArr, pArr)) {
            list.add(0);
        }
        for (int i = 1; i <= (s.length() - p.length()); i ++) {
            sArr[s.charAt(i - 1) - 'a'] -= 1;
            sArr[s.charAt(i + p.length() - 1) - 'a'] += 1;
            if (Arrays.equals(sArr, pArr)) {
                list.add(i);
            }
        }
        return list;
    }

    // timeout
    public List<Integer> findAnagrams2(String s, String p) {
        List<Integer> list = new ArrayList<>();
        int strLength = p.length();
        String sortedStr = sortedStr(p);
        for(int i = 0; i < s.length(); i ++) {
            if ((i + strLength - 1) >= s.length()) {
                break;
            }
            String sortStr2 = sortedStr(s.substring(i, i + strLength));
            if (sortedStr.equals(sortStr2)) {
                list.add(i);
            }
        }
        return list;
    }

    private String sortedStr(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return Arrays.toString(chars);
    }
}