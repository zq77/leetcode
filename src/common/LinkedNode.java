package common;

public class LinkedNode {
    public int val;
    public LinkedNode prev;
    public LinkedNode next;

    public LinkedNode(int val) {
        this.val = val;
    }

    public LinkedNode(int val, LinkedNode prev, LinkedNode next) {
        this.val = val;
        this.prev = prev;
        this.next = next;
    }
    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("[");
        str.append(val);
        LinkedNode next1 = next;
        while (next1 != null) {
            str.append(",").append(next1.val);
            next1 = next1.next;
        }
        str.append("]");
        return str.toString();
    }
}
