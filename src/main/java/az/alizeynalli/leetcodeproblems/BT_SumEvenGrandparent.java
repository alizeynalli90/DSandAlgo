package az.alizeynalli.leetcodeproblems;

import az.alizeynalli.dt.binarytree.TreeNode;

// https://leetcode.com/problems/sum-of-nodes-with-even-valued-grandparent/
public class BT_SumEvenGrandparent {

    public int sumEvenGrandparent(TreeNode root) {
        return rec(root, null, 0);
    }

    private int rec(TreeNode root, TreeNode parent, int answer){
        if(root != null){
            if(parent != null && parent.val % 2 == 0){
                if(root.left != null){
                    answer += root.left.val;
                }
                if(root.right != null){
                    answer += root.right.val;
                }
            }
            answer = rec(root.left, root, answer);
            answer = rec(root.right, root, answer);
        }
        return answer;
    }
}
