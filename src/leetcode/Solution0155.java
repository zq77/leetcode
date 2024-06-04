package leetcode;


import java.util.Arrays;
import java.util.Objects;

public class Solution0155 {
    private Integer[] array;
    private transient int modCount = 0;

    private Integer min = null;

    public Solution0155() {
        array = new Integer[10];
    }

    public void push(int val) {
        if (modCount == array.length) {
            int newCapacity = modCount + (modCount >> 1);
            array = Arrays.copyOf(array, newCapacity);
        }
        array[modCount++] = val;
        if(min == null || min > val) {
            min = val;
        }
    }

    public void pop() {
        modCount = modCount - 1;

        boolean recaluteMin = Objects.equals(array[modCount], min);
        array[modCount] = null;

        if (recaluteMin) {
            min = array[0];
            for (int i = 1; i < modCount; i++) {
                min = Math.min(min, array[i]);
            }
        }
    }

    public int top() {
        return array[modCount-1];
    }

    public int getMin() {
        return min;
    }

    public static void main(String[] args) {
        Solution0155 stack = new Solution0155();
        stack.push(2);
        stack.push(0);
        stack.push(3);
        stack.push(0);
        stack.push(1);
        stack.push(1);
        stack.push(1);
        stack.push(1);
        stack.push(1);
        stack.push(1);
        stack.push(1);
        stack.push(1);
        System.out.println(stack.getMin());
        stack.pop();
        System.out.println(stack.getMin());
        stack.pop();
        System.out.println(stack.getMin());
        stack.pop();
        System.out.println(stack.getMin());
    }
}