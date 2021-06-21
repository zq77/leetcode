import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Solution0002Test {
    private Solution0002 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution0002();
    }

    @Test
    void test1() {
        Solution0002.ListNode l1 = convertToListNode(new int[]{2, 4, 3});
        Solution0002.ListNode l2 = convertToListNode(new int[]{5, 6, 4});
        Solution0002.ListNode result = solution.addTwoNumbers(l1, l2);
        assertArrayEquals(new int[]{ 7,0,8 }, convertToArray(result));
    }

    @Test
    void test2() {
        Solution0002.ListNode l1 = convertToListNode(new int[]{0});
        Solution0002.ListNode l2 = convertToListNode(new int[]{0});
        Solution0002.ListNode result = solution.addTwoNumbers(l1, l2);
        assertArrayEquals(new int[]{ 0 }, convertToArray(result));
    }

    @Test
    void test3() {
        Solution0002.ListNode l1 = convertToListNode(new int[]{9,9,9,9,9,9,9});
        Solution0002.ListNode l2 = convertToListNode(new int[]{9,9,9,9});
        Solution0002.ListNode result = solution.addTwoNumbers(l1, l2);
        assertArrayEquals(new int[]{ 8,9,9,9,0,0,0,1 }, convertToArray(result));
    }

    Solution0002.ListNode convertToListNode(int[] input) {
        Solution0002.ListNode ln = null;
        for (int i = input.length - 1; i >= 0; i --) {
            ln = new Solution0002.ListNode(input[i], ln);
        }
        return ln;
    }

    int[] convertToArray(Solution0002.ListNode l1) {
        if (l1 == null) {
            return new int[0];
        }
        List<Integer> list = new ArrayList<>();
        while (l1 != null) {
            list.add(l1.val);
            l1 = l1.next;
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}