package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution0692Test {
    private Solution0692 solution;
    @BeforeEach
    void setUp() {
        solution = new Solution0692();
    }
    @Test
    public void test1() {
        final List<String> list = solution.topKFrequent(new String[]{"i", "love", "leetcode", "i", "love", "coding"}, 3);
        assertEquals("[i, love, coding]", list.toString());
    }
}
