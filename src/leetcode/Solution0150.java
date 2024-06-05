package leetcode;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution0150 {
    private List<String> notNumberList = new ArrayList<>();
    {
        notNumberList.add("+");
        notNumberList.add("-");
        notNumberList.add("*");
        notNumberList.add("/");
    }
    public int evalRPN(String[] tokens) {
        if(tokens == null || tokens.length == 0) {
            return 0;
        }
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            if (!notNumberList.contains(token)) {
                stack.push(Integer.parseInt(token));
            } else {
                final Integer first = stack.pop();
                final Integer second = stack.pop();
                int value = switch (token) {
                    case "+" -> second + first;
                    case "-" -> second - first;
                    case "*" -> second * first;
                    case "/" -> second / first;
                    default -> throw new IllegalStateException("Unexpected value: " + token);
                };
                stack.push(value);
            }
        }
        return stack.pop();
    }

}