package leetcode;

import common.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution1209Test {
    private Solution1209 solution;
    @BeforeEach
    void setUp() {
        solution = new Solution1209();
    }
    @Test
    public void test1() {
        final String s = solution.removeDuplicates("abcd", 2);
        assertEquals("abcd", s);
    }
    @Test
    public void test2() {
        final String s = solution.removeDuplicates("deeedbbcccbdaa", 3);
        assertEquals("aa", s);
    }
    @Test
    public void test3() {
        final String s = solution.removeDuplicates("pbbcggttciiippooaais", 2);
        assertEquals("ps", s);
    }
    @Test
    public void test4() {
        final String s = solution.removeDuplicates("nnwssswwnvbnnnbbqhhbbbhmmmlllm", 3);
        assertEquals("vqm", s);
    }
}
