import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution0002 {

    public static void main(String[] args) {
        ListNode l1 = new Solution0002().convertToListNode(new int[]{2, 4, 3});
        ListNode l2 = new Solution0002().convertToListNode(new int[]{5, 6, 4});
        ListNode result = new Solution0002().addTwoNumbers(l1, l2);
        // except [7,0,8]
        System.out.println(Arrays.toString(new Solution0002().convertToArray(result)));

        l1 = new Solution0002().convertToListNode(new int[]{0});
        l2 = new Solution0002().convertToListNode(new int[]{0});
        result = new Solution0002().addTwoNumbers(l1, l2);
        // except [0]
        System.out.println(Arrays.toString(new Solution0002().convertToArray(result)));

        l1 = new Solution0002().convertToListNode(new int[]{9,9,9,9,9,9,9});
        l2 = new Solution0002().convertToListNode(new int[]{9,9,9,9});
        result = new Solution0002().addTwoNumbers(l1, l2);
        // except [8,9,9,9,0,0,0,1]
        System.out.println(Arrays.toString(new Solution0002().convertToArray(result)));
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null) {
            return null;
        }
        ListNode orgResult = new ListNode();
        ListNode result = orgResult;
        int cursor = 0;
        while (l1 != null || l2 != null) {
            int value = cursor;
            if (l1 != null) {
                value += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                value += l2.val;
                l2 = l2.next;
            }
            if (value >= 10) {
                cursor = value / 10;
                value = value % 10;
            } else {
                cursor = 0;
            }
            result.next = new ListNode(value);
            result = result.next;
        }
        if (cursor > 0) {
            result.next = new ListNode(cursor);
        }
        return orgResult.next;
    }

    public ListNode convertToListNode(int[] input) {
        ListNode ln = null;
        for (int i = input.length - 1; i >= 0; i --) {
            ln = new ListNode(input[i], ln);
        }
        return ln;
    }

    public int[] convertToArray(ListNode l1) {
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

    private class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}