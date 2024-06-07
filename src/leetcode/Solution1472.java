package leetcode;

import common.ListNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * BrowserHistory
 */
public class Solution1472 {
    private Deque<String> q1 = new LinkedList<>();
    private Deque<String> q2 = new LinkedList<>();

    public Solution1472(String homepage) {
        q1.push(homepage);
    }

    public void visit(String url) {
        q1.push(url);
        q2.clear();
    }

    public String back(int steps) {
        for (int i = 0; i < steps && q1.size() > 1; i++) {
            q2.push(q1.pop());
        }
        return q1.peek();
    }

    public String forward(int steps) {
        for (int i = 0; i < steps && !q2.isEmpty(); i++) {
            q1.push(q2.pop());
        }
        return q1.peek();
    }

    public static void main(String[] args) {
        Solution1472 history = new Solution1472("leetcode");
        history.visit("google");
        history.visit("facebook");
        history.visit("youtube");
        System.out.println("facebook".equals(history.back(1)));
        System.out.println("google".equals(history.back(1)));
        System.out.println("leetcode".equals(history.back(1)));
        System.out.println("google".equals(history.forward(1)));
        history.visit("linkedin");
        System.out.println("linkedin".equals(history.forward(2)));
        System.out.println("google".equals(history.back(1)));
        System.out.println("leetcode".equals(history.back(2)));
    }
}

//public class Solution1472 {
//    private LinkedList<String> list = new LinkedList<>();
//
//    private int currentIndex;
//    public Solution1472(String homepage) {
//        list.add(homepage);
//    }
//
//    public void visit(String url) {
//        list.add(url);
//        if (currentIndex != list.size() - 2) {
//            for (int i = list.size() - 2; i > currentIndex; i--) {
//                list.remove(i);
//            }
//        }
//        currentIndex = list.size() - 1;
//    }
//
//    public String back(int steps) {
//        currentIndex = currentIndex - steps;
//        if (currentIndex < 0) {
//            currentIndex = 0;
//        }
//        if (list.isEmpty()) {
//            return "";
//        }
//        return list.get(currentIndex);
//    }
//
//    public String forward(int steps) {
//        currentIndex = currentIndex + steps;
//        if (currentIndex >= list.size()) {
//            currentIndex = list.size() - 1;
//        }
//        return list.get(currentIndex);
//    }
//
//    public static void main(String[] args) {
//        Solution1472 history = new Solution1472("leetcode");
//        history.visit("google");
//        history.visit("facebook");
//        history.visit("youtube");
//        System.out.println("facebook".equals(history.back(1)));
//        System.out.println("google".equals(history.back(1)));
//        System.out.println("leetcode".equals(history.back(1)));
//        System.out.println("google".equals(history.forward(1)));
//        history.visit("linkedin");
//        System.out.println("linkedin".equals(history.forward(2)));
//        System.out.println("google".equals(history.back(1)));
//        System.out.println("leetcode".equals(history.back(2)));
//    }
//}