package az.alizeynalli.leetcodeproblems;


import az.alizeynalli.dt.binarytree.TreeNode;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/increasing-order-search-tree/
public class BST_SearchIncreasingOrder {
    public TreeNode increasingBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        TreeNode result = new TreeNode(0);
        TreeNode temp = result;
        inorder(root, list);
        for (int element : list) {
            temp.right = new TreeNode(element);
            temp = temp.right;
        }
        return result.right;
    }

    private void inorder(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }

        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);

    }
}
