package az.alizeynalli.leetcodeproblems;


import az.alizeynalli.dt.binarytree.TreeNode;

// https://leetcode.com/problems/merge-two-binary-trees/
public class BT_MergeTwoBT {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {

        if (root1 == null) {
            return root2;
        }
        if (root2 == null) {
            return root1;
        }
        root1.val += root2.val;
        root1.left = mergeTrees(root1.left, root2.left);
        root1.right = mergeTrees(root1.right, root2.right);
        return root1;
    }
}
