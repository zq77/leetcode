package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution0049Test {
    private Solution0049 solution;
    @BeforeEach
    void setUp() {
        solution = new Solution0049();
    }
    @Test
    public void test1() {
        String[] strs = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        final List<List<String>> result = solution.groupAnagrams(strs);
        assertEquals("[[bat], [nat, tan], [ate, tea, eat]]", result.toString());
    }
    @Test
    public void test2() {
        String[] strs = new String[]{};
        final List<List<String>> result = solution.groupAnagrams(strs);
        assertEquals("[[]]", result.toString());
    }
    @Test
    public void test3() {
        String[] strs = new String[]{"a"};
        final List<List<String>> result = solution.groupAnagrams(strs);
        assertEquals("[[a]]", result.toString());
    }
    @Test
    public void test4() {
        String[] strs = new String[]{"ddddddddddg", "dgggggggggg"};
        final List<List<String>> result = solution.groupAnagrams(strs);
        assertEquals("[[dgggggggggg], [ddddddddddg]]", result.toString());
    }
}
