package leetcode;


import java.util.Deque;
import java.util.LinkedList;

public class Solution0066 {
    public int[] plusOne(int[] digits) {
        Deque<Integer> deque = new LinkedList<>();
        int flag = 1;
        for(int i = digits.length - 1; i >= 0; i --) {
            if (digits[i] + flag == 10) {
                deque.addFirst(0);
                flag = 1;
            } else {
                deque.addFirst(digits[i] + flag);
                flag = 0;
            }
        }
        if (flag == 1) {
            deque.addFirst(1);
        }
        return deque.stream().mapToInt(a -> a).toArray();
    }
}