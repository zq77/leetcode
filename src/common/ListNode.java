package common;

public class ListNode {
    public int val;
    public ListNode next;
    public ListNode() {}
    public ListNode(int val) { this.val = val; }
    public ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("[");
        str.append(val);
        ListNode next1 = next;
        while (next1 != null) {
            str.append(",").append(next1.val);
            next1 = next1.next;
        }
        str.append("]");
        return str.toString();
    }
}
