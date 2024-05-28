import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution0147Test {
    private Solution0147 solution;
    @BeforeEach
    void setUp() {
        solution = new Solution0147();
    }
    @Test
    public void test1() {

        ListNode head = new ListNode(4, new ListNode(2, new ListNode(1, new ListNode(3))));
        ListNode result = solution.insertionSortList(head);
        assertEquals("[1,2,3,4]", result.toString());
    }
    @Test
    public void test2() {

        ListNode head = new ListNode(-1, new ListNode(5, new ListNode(3, new ListNode(4, new ListNode(0)))));
        ListNode result = solution.insertionSortList(head);
        assertEquals("[-1,0,3,4,5]", result.toString());
    }
}
