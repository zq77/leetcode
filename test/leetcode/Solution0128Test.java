package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution0128Test {
    private Solution0128 solution;
    @BeforeEach
    void setUp() {
        solution = new Solution0128();
    }
    @Test
    public void test1() {
        final int s = solution.longestConsecutive(new int[]{100,4,200,1,3,2});
        assertEquals(4, s);
    }
    @Test
    public void test2() {
        int s = solution.longestConsecutive(new int[]{0,3,7,2,5,8,4,6,0,1});
        assertEquals(9, s);
    }
    @Test
    public void test3() {
        int s = solution.longestConsecutive(new int[]{0});
        assertEquals(1, s);
    }
    @Test
    public void test4() {
        int s = solution.longestConsecutive(new int[]{1,2,0,1});
        assertEquals(3, s);
    }
}
