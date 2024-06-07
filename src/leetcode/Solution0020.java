package leetcode;


import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution0020 {
    private Map<Character, Character> map = new HashMap<>();
    {
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
    }
    public boolean isValid(String s) {
        if (s == null || s.length() < 2) {
            return false;
        }
        final char[] charArray = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < charArray.length; i++) {
            if (map.containsValue(charArray[i])) {
                stack.push(charArray[i]);
            } else {
                if (stack.empty() || map.get(charArray[i]) != stack.pop()) {
                    return false;
                }
            }
        }
        return stack.empty();
    }

}