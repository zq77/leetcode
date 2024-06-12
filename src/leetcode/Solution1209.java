package leetcode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

/**
 * 示例 1：
 *
 * 输入：s = "abcd", k = 2
 * 输出："abcd"
 * 解释：没有要删除的内容。
 * 示例 2：
 *
 * 输入：s = "deeedbbcccbdaa", k = 3
 * 输出："aa"
 * 解释：
 * 先删除 "eee" 和 "ccc"，得到 "ddbbbdaa"
 * 再删除 "bbb"，得到 "dddaa"
 * 最后删除 "ddd"，得到 "aa"
 * 示例 3：
 *
 * 输入：s = "pbbcggttciiippooaais", k = 2
 * 输出："ps"
 */
public class Solution1209 {
    public String removeDuplicates(String s, int k) {
        if (s == null || s.length() < 2 || k < 2) {
            return s;
        }
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < sb.length(); i++) {
            if (i == 0 || sb.charAt(i) != sb.charAt(i - 1)) {
                stack.push(1);
            } else {
                final Integer temp = stack.pop() + 1;
                if (temp == k) {
                    sb.delete(i - k + 1, i + 1);
                    i = i-k;
                } else {
                    stack.push(temp);
                }
            }
        }
        return sb.toString();
    }
    public String removeDuplicates2(String s, int k) {
        if (s == null || s.length() < 2 || k < 2) {
            return s;
        }
        StringBuilder sb = new StringBuilder(s);
        char duplicateChar = 0;
        boolean reRun = false;
        for (int i = 0, count = 1; i < sb.length(); i++) {
            if (i == 0 || duplicateChar != sb.charAt(i)) {
                duplicateChar = sb.charAt(i);
                count = 1;
                if (reRun && i == sb.length() - 1) {
                    i = 0;
                    count = 1;
                    duplicateChar = sb.charAt(i);
                    reRun = false;
                    continue;
                }
                continue;
            }
            count ++;
            if (count == k) {
                reRun = true;
                sb.delete(i + 1 - k, i + 1);
                if (sb.isEmpty()) {
                    break;
                }
                i = Math.max(i - k, 0);
                count = 1;
                duplicateChar = sb.charAt(i);
            }
            if (reRun && i == sb.length() - 1) {
                i = 0;
                count = 1;
                duplicateChar = sb.charAt(i);
                reRun = false;
            }
        }
        return sb.toString();
    }

}