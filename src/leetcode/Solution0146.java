package leetcode;

import common.LinkedNode;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 */
public class Solution0146 {

    public static void main(String[] args) {
        LRUCache lru = new LRUCache(2);
        lru.put(1, 1);
        lru.put(2, 2);
        System.out.println(1 == lru.get(1));
        lru.put(3, 3);
        System.out.println(-1 == lru.get(2));
        lru.put(4, 4);
        System.out.println(-1 == lru.get(1));
        System.out.println(3 == lru.get(3));
        System.out.println(4 == lru.get(4));
    }

    public static void main2(String[] args) {
        LRUCache lru = new LRUCache(3);
        lru.put(2, 1);
        lru.put(1, 1);
        lru.put(2, 3);
        lru.put(5, 5);
        lru.put(5, 55);
        lru.put(4, 1);
        System.out.println(3 == lru.get(2));
    }

}
class LRUCache {
    private Map<Integer, LinkedNode> cache;
    private LinkedNode head, end;
    private int initialCapacity;
    public LRUCache(int capacity) {
        cache = new HashMap<>(capacity);
        initialCapacity = capacity;
    }

    public int get(int key) {
        final LinkedNode result = cache.get(key);
        if (result == null) {
            return -1;
        }
        moveToHead(result);
        return result.val;
    }

    private void moveToHead(LinkedNode result) {
        if (head == null) {
            head = result;
            return;
        }
        if (result.prev != null) {
            result.prev.next = result.next;
        }
        result.next = head;
        head.prev = result;
        head = result;
    }

    public void put(int key, int value) {
        LinkedNode result = cache.get(key);
        if (result == null && cache.size() == initialCapacity) {
            if (end == null) {
                LinkedNode node = head;
                while (node != null) {
                    end = node;
                    node = node.next;
                }
            }
            final Integer removeKey = end.val;
            cache.remove(removeKey);
            end = end.prev;
            end.next = null;
        }
        if (result == null) {
            result = new LinkedNode(value);
        }
        moveToHead(result);
        cache.put(key, head);
    }
}

class LRUCache2 {
    private LinkedHashMap<Integer, Integer> cache;
    private int initialCapacity;
    public LRUCache2(int capacity) {
        cache = new LinkedHashMap<>(capacity);
        initialCapacity = capacity;
    }

    public int get(int key) {
        final Integer value = cache.remove(key);
        if (value == null) {
            return -1;
        }
        cache.put(key, value);
        return value;
    }

    public void put(int key, int value) {
        final Integer existValue = cache.remove(key);
        if (existValue == null && cache.size() == initialCapacity) {
            cache.remove(cache.keySet().iterator().next()); // remove latest key
        }
        cache.put(key, value);
    }
}