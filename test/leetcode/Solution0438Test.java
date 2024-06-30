package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution0438Test {
    private Solution0438 solution;
    @BeforeEach
    void setUp() {
        solution = new Solution0438();
    }
    @Test
    public void test1() {
        final List<Integer> result = solution.findAnagrams("cbaebabacd", "abc");
        assertEquals("[0, 6]", result.toString());
    }
    @Test
    public void test2() {
        final List<Integer> result = solution.findAnagrams("abab", "ab");
        assertEquals("[0, 1, 2]", result.toString());
    }
    @Test
    public void test3() {
        final List<Integer> result = solution.findAnagrams("aa", "bb");
        assertEquals("[]", result.toString());
    }
}
