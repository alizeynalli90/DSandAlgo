package az.alizeynalli.leetcodeproblems;


import az.alizeynalli.dt.binarytree.TreeNode;

// https://leetcode.com/problems/maximum-depth-of-binary-tree/
public class BT_MaxDepth {
    public static int maxDepthBottomUp(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = maxDepthBottomUp(root.left);
        int right = maxDepthBottomUp(root.right);

        return max(left, right) + 1;
    }


    private static int max(int a, int b) {
        return a <= b ? b : a;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(4), null), new TreeNode(3));
        System.out.println(maxDepthBottomUp(root));

    }
}
