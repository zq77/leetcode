package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution0058Test {
    private Solution0058 solution;
    @BeforeEach
    void setUp() {
        solution = new Solution0058();
    }
    @Test
    public void test1() {
        final int i = solution.lengthOfLastWord("Hello World");
        assertEquals(5, i);
    }
    @Test
    public void test2() {
        final int i = solution.lengthOfLastWord("   fly me   to   the moon  ");
        assertEquals(4, i);
    }
}
