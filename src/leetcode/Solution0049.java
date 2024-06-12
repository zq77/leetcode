package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 示例 1:
 *
 * 输入: strs = ["eat", "tea", "tan", "ate", "nat", "bat"]
 * 输出: [["bat"],["nat","tan"],["ate","eat","tea"]]
 *
 * 示例 2:
 *
 * 输入: strs = [""]
 * 输出: [[""]]
 *
 * 示例 3:
 *
 * 输入: strs = ["a"]
 * 输出: [["a"]]
 */
public class Solution0049 {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length < 1) {
            List<List<String>> result = new ArrayList<>();
            result.add(new ArrayList<>());
            return result;
        }
        Map<String, List<String>> map = new HashMap<>();
        for (int i = strs.length - 1; i >= 0; i--) {
            char[] charArray = strs[i].toCharArray();
            Arrays.sort(charArray);
            String sortStr = Arrays.toString(charArray);
            List<String> list = map.computeIfAbsent(sortStr, k -> new ArrayList<>());
            list.add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        System.out.println(Math.round((float) 2/3));
        System.out.println((float) 2/3);
    }
}
