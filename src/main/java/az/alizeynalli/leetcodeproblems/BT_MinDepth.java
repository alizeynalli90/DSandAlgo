package az.alizeynalli.leetcodeproblems;

import az.alizeynalli.dt.binarytree.TreeNode;

// https://leetcode.com/problems/minimum-depth-of-binary-tree/
public class BT_MinDepth {
    public int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        return (left == 0 || right == 0) ? left + right + 1: Math.min(left,right) + 1;

    }
}
