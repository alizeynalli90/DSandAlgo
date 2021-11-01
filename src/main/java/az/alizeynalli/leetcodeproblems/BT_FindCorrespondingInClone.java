package az.alizeynalli.leetcodeproblems;

import az.alizeynalli.dt.binarytree.TreeNode;

// https://leetcode.com/problems/find-a-corresponding-node-of-a-binary-tree-in-a-clone-of-that-tree/
public class BT_FindCorrespondingInClone {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        return rec(cloned, target, null);
    }

    private TreeNode rec(TreeNode cloned, TreeNode target, TreeNode result){
        if(cloned == null){
            return result;
        }
        if(cloned.val == target.val){
            result = cloned;
        }
        result = rec(cloned.left, target, result);
        result = rec(cloned.right, target, result);
        return result;
    }
}
