package az.alizeynalli.leetcodeproblems;


import az.alizeynalli.dt.binarytree.TreeNode;

// https://leetcode.com/problems/search-in-a-binary-search-tree/
public class BST_SearchSubTree {

    public static TreeNode searchBST(TreeNode root, int val) {
        return searchRecursive(root, val);
    }

    private static TreeNode searchRecursive(TreeNode root, int val) {
        if (root == null) {
            return null;
        }
        if (root.val == val) {
            return root;
        }
        if (root.val < val) {
            return searchRecursive(root.right, val);
        } else {
            return searchRecursive(root.left, val);
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5, new TreeNode(3), new TreeNode(8));
        root.left.left = new TreeNode(1);
        searchRecursive(root, 3);
    }
}
