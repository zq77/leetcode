import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution0003Test {

    private Solution0003 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution0003();
    }

    @Test
    void test1() {
        int result = solution.lengthOfLongestSubstring("abcabcbb");
        assertEquals(3, result);
    }

    @Test
    void test2() {
        int result = solution.lengthOfLongestSubstring("bbbbb");
        assertEquals(1, result);
    }

    @Test
    void test3() {
        int result = solution.lengthOfLongestSubstring("pwwkew");
        assertEquals(3, result);
    }

    @Test
    void test4() {
        int result = solution.lengthOfLongestSubstring("dvdf");
        assertEquals(3, result);
    }

    @Test
    void test5() {
        int result = solution.lengthOfLongestSubstring("dsvdf");
        assertEquals(4, result);
    }

    @Test
    void test6() {
        int result = solution.lengthOfLongestSubstring("tmmzuxt");
        assertEquals(5, result);
    }

    @Test
    void test7() {
        int result = solution.lengthOfLongestSubstring("bpfbhmipx");
        assertEquals(7, result);
    }

}