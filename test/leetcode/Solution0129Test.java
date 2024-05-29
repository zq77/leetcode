package leetcode;

import common.TreeNode;
import leetcode.Solution0129;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution0129Test {
    private Solution0129 solution;
    @BeforeEach
    void setUp() {
        solution = new Solution0129();
    }
    @Test
    public void test1() {
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        TreeNode treeNode = new TreeNode(1, left, right);
        int result = solution.sumNumbers(treeNode);
        assertEquals(25, result);
    }
    @Test
    public void test2() {
        TreeNode left2 = new TreeNode(5);
        TreeNode right = new TreeNode(1);
        TreeNode left = new TreeNode(9, left2, right);

        TreeNode treeNode = new TreeNode(4, left, new TreeNode(0));
        int result = solution.sumNumbers(treeNode);
        assertEquals(1026, result);
    }

    @Test
    public void test3() {
        short s1 = 1;
    }
}
