package leetcode;

import common.TreeNode;
import leetcode.Solution0102;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution0102Test {
    private Solution0102 solution;
    @BeforeEach
    void setUp() {
        solution = new Solution0102();
    }
    @Test
    public void test1() {
        TreeNode right = new TreeNode(20, new TreeNode(15), new TreeNode(7));
        TreeNode left = new TreeNode(9);
        TreeNode treeNode = new TreeNode(3, left, right);
        final List<List<Integer>> lists = solution.levelOrder(treeNode);
        assertEquals("[[3], [9, 20], [15, 7]]", Arrays.toString(lists.toArray()));
    }
    @Test
    public void test2() {

        TreeNode treeNode = new TreeNode(1);
        final List<List<Integer>> lists = solution.levelOrder(treeNode);
        assertEquals("[[1]]", Arrays.toString(lists.toArray()));
    }

    @Test
    public void test3() {
        final List<List<Integer>> lists = solution.levelOrder(null);
        assertEquals("[]", Arrays.toString(lists.toArray()));
    }
}
