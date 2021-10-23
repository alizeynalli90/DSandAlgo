package az.alizeynalli.leetcodeproblems;


import az.alizeynalli.dt.binarytree.TreeNode;

// https://leetcode.com/problems/range-sum-of-bst/
public class BST_SumRange {
    public int rangeSumBST(TreeNode root, int low, int high) {
        int result = 0;
        result = traverse(root, low, high, result);
        return result;
    }

    private int traverse(TreeNode node, int low, int high, int result) {
        if (node != null) {
            if (node.val >= low && node.val <= high) {
                result += node.val;
            }
            result = traverse(node.left, low, high, result);
            result = traverse(node.right, low, high, result);
        }
        return result;
    }
}
