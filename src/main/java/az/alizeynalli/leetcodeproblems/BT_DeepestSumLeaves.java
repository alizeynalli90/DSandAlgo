package az.alizeynalli.leetcodeproblems;

// https://leetcode.com/problems/deepest-leaves-sum/
import az.alizeynalli.dt.binarytree.TreeNode;

public class BT_DeepestSumLeaves {
    public static int deepestLeavesSum(TreeNode root) {
        int max = findMax(root);
        return findSum(root, max, 0, 0);
    }

    private static int findMax(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = findMax(root.left);
        int right = findMax(root.right);
        return Math.max(left, right) + 1;
    }

    private static int findSum(TreeNode root, int max, int level, int sum) {
        if (root == null) {
            return sum;
        }
        if (level + 1 == max) {
            sum += root.val;
        }
        sum = findSum(root.left, max, level + 1, sum);
        sum = findSum(root.right, max, level + 1, sum);

        return sum;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(4), null), new TreeNode(3, new TreeNode(2), null));
        System.out.println(deepestLeavesSum(root));
    }
}
