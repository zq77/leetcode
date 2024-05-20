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
        Solution0129.TreeNode left = new Solution0129.TreeNode(2);
        Solution0129.TreeNode right = new Solution0129.TreeNode(3);
        Solution0129.TreeNode treeNode = new Solution0129.TreeNode(1, left, right);
        int result = solution.sumNumbers(treeNode);
        assertEquals(25, result);
    }
    @Test
    public void test2() {
        Solution0129.TreeNode left2 = new Solution0129.TreeNode(5);
        Solution0129.TreeNode right = new Solution0129.TreeNode(1);
        Solution0129.TreeNode left = new Solution0129.TreeNode(9, left2, right);

        Solution0129.TreeNode treeNode = new Solution0129.TreeNode(4, left, new Solution0129.TreeNode(0));
        int result = solution.sumNumbers(treeNode);
        assertEquals(1026, result);
    }

    @Test
    public void test3() {
        short s1 = 1;
    }
}
