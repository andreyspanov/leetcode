package leetcode.leetcode617;

import leetcode.leetcode617.Solution.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void test() {
        TreeNode tree1 = new TreeNode(1, new TreeNode(3, new TreeNode(5), null), new TreeNode(2));
        TreeNode tree2 = new TreeNode(2, new TreeNode(1, null, new TreeNode(4)), new TreeNode(3, null, new TreeNode(7)));
        TreeNode expected = new TreeNode(3, new TreeNode(4, new TreeNode(5), new TreeNode(4)), new TreeNode(5, null, new TreeNode(7)));
        Assertions.assertEquals(expected, Solution.mergeTrees(tree1, tree2));
    }

    @Test
    void test2() {
        TreeNode tree1 = new TreeNode(1);
        TreeNode tree2 = new TreeNode(1, new TreeNode(2), null);
        TreeNode expected = new TreeNode(2, new TreeNode(2), null);
        Assertions.assertEquals(expected, Solution.mergeTrees(tree1, tree2));
    }
}
