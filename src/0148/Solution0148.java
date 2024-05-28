import java.util.ArrayList;
import java.util.List;

/**
 * 输入：head = [4,2,1,3]
 * 输出：[1,2,3,4]
 * 输入：head = [-1,5,3,4,0]
 * 输出：[-1,0,3,4,5]
 * 输入：head = []
 * 输出：[]
 */
public class Solution0148 {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }

        return mergeSortList(head, null);
    }

    // 归并排序
    private ListNode mergeSortList(ListNode head, ListNode end) {
        if (head == null) {
            return head;
        }
        if (head.next == end) {
            head.next = null;
            return head;
        }
        ListNode slow = head, fast = head;
        while (fast != end) {
            slow = slow.next;
            fast = fast.next;
            if (fast != end) {
                fast = fast.next;
            }
        }
        ListNode mid = slow;
        ListNode left = mergeSortList(head, mid);
        ListNode right = mergeSortList(mid, end);
        ListNode result = new ListNode();
        ListNode node = result;
        while (left != null && right != null) {
            if (left.val > right.val) {
                node.next = right;
                right = right.next;
            } else {
                node.next = left;
                left = left.next;
            }
            node = node.next;
        }
        while (left != null) {
            node.next = left;
            left = left.next;
            node = node.next;
        }
        while (right != null) {
            node.next = right;
            right = right.next;
            node = node.next;
        }
        return result.next;
    }
    // 快速排序
//    public ListNode quickSortList(ListNode head) {
//        if(head == null || head.next == null) {
//            return head;
//        }
//        List<ListNode> list = new ArrayList<>();
//        while (head != null) {
//            list.add(head);
//            head = head.next;
//        }
//        ListNode[] array = list.toArray(new ListNode[0]);
//        deep(array, 0, array.length - 1);
//        ListNode root = array[0];
//        ListNode node = root;
//        for (int i = 1; i < array.length; i++) {
//            node.next = array[i];
//            node = node.next;
//        }
//        node.next = null;
//        return root;
//    }
//
//    private void deep(ListNode[] array, int start, int end) {
//        if (start >= end) {
//            return;
//        }
//        ListNode flag = array[start];
//        int i = start;
//        int j = end;
//        while (j > i) {
//            // find first < flag
//            while(array[j].val > flag.val && i < j) {
//                j--;
//            }
//            array[i] = array[j];
//            // find first > flag
//            while (array[i].val < flag.val && i < j) {
//                i++;
//            }
//            array[j] = array[i];
//        }
//        array[i] = flag;
//        deep(array, start, i - 1);
//        deep(array, j + 1, end);
//    }

}