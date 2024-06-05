package leetcode;


import java.util.Arrays;
import java.util.Objects;
import java.util.Stack;

public class Solution0232 {
    private Stack<Integer> inStack = new Stack<>();
    private Stack<Integer> outStack = new Stack<>();

    public Solution0232() {

    }

    public void push(int val) {
        inStack.push(val);
    }

    public int pop() {
        if (outStack.empty()) {
            inToOut();
        }
        return outStack.pop();
    }

    public int peek() {
        if (outStack.empty()) {
            inToOut();
        }
        return outStack.peek();
    }

    private void inToOut() {
        while (!inStack.empty()) {
            outStack.push(inStack.pop());
        }
    }

    public boolean empty() {
        return inStack.empty() && outStack.empty();
    }

    public static void main(String[] args) {
        Solution0232 stack = new Solution0232();
        stack.push(1);
        stack.push(2);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.empty());
    }
}