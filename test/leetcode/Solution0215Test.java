package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution0215Test {
    private Solution0215 solution;
    @BeforeEach
    void setUp() {
        solution = new Solution0215();
    }
    @Test
    public void test1() {
        final int result = solution.findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2);
        assertEquals(5, result);
    }
    @Test
    public void test2() {
        final int result = solution.findKthLargest(new int[]{3,2,3,1,2,4,5,5,6}, 4);
        assertEquals(4, result);
    }

    @Test
    public void test3() {
        String str = new String("str") + new String("02");
        str.intern();
        String str3 = new String("str02");
        String str2 = "str02";
        System.out.println(str3 == str2);
    }
}
