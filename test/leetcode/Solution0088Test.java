package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution0088Test {

    private Solution0088 solution;

    @BeforeEach
    private void setup() {
        solution = new Solution0088();
    }

    @Test
    public void test1() {
        int[] num1 = new int[]{1,2,3,0,0,0};
        int[] num2 = new int[]{2,5,6};
        int m = 3, n = 3;
        solution.merge(num1, m, num2, n);
        assertEquals("[1, 2, 2, 3, 5, 6]", Arrays.toString(num1));
    }

    @Test
    public void test2() {
        int[] num1 = new int[]{1};
        int[] num2 = new int[]{};
        int m = 1, n = 0;
        solution.merge(num1, m, num2, n);
        assertEquals("[1]", Arrays.toString(num1));
    }

    @Test
    public void test3() {
        int[] num1 = new int[]{0};
        int[] num2 = new int[]{1};
        int m = 0, n = 1;
        solution.merge(num1, m, num2, n);
        assertEquals("[1]", Arrays.toString(num1));
    }
}