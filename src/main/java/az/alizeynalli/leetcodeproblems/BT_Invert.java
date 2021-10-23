package az.alizeynalli.leetcodeproblems;


import az.alizeynalli.dt.binarytree.TreeNode;

// https://leetcode.com/problems/invert-binary-tree/
public class BT_Invert {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return root;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }

}
