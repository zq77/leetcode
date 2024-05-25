import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution0148Test {
    private Solution0148 solution;
    @BeforeEach
    void setUp() {
        solution = new Solution0148();
    }
    @Test
    public void test1() {

        ListNode head = new ListNode(4, new ListNode(2, new ListNode(1, new ListNode(3))));
        ListNode result = solution.sortList(head);
        assertEquals("[1,2,3,4]", result.toString());
    }
}
