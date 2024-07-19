package leetcode;


import java.util.Deque;
import java.util.LinkedList;

public class Solution0058 {
    public int lengthOfLastWord(String s) {
        char[] chars = s.toCharArray();
        int len = 0;
        for(int i = chars.length - 1; i >= 0; i --) {
            if (chars[i] == ' ') {
                if (len == 0) {
                    continue;
                }
                if (len > 0) {
                    return len;
                }
            } else {
                len ++;
            }
        }
        return len;
    }
}