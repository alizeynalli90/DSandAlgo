package az.alizeynalli.leetcodeproblems;

import az.alizeynalli.dt.binarytree.TreeNode;

import java.util.*;

// https://leetcode.com/problems/binary-tree-level-order-traversal/
public class BT_LevelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        Queue<Object[]> queue = new LinkedList<>();
        Map<Integer, List<Integer>> map = new HashMap<>();
        Object first[] = {root, 1};
        queue.add(first);
        while(!queue.isEmpty()){
            Object[] actual = queue.poll();
            TreeNode actualNode = (TreeNode) actual[0];
            if(map.containsKey(actual[1])){
                map.get(actual[1]).add(actualNode.val);
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(actualNode.val);
                map.put((Integer) actual[1], list);
            }
            if(actualNode.left != null){
                Object left[] = {actualNode.left, (((Integer) actual[1])+1)};
                queue.add(left);
            }
            if(actualNode.right != null){
                Object right[] = {actualNode.right, (((Integer) actual[1])+1)};
                queue.add(right);
            }
        }

        for(Integer key: map.keySet()){
            result.add(map.get(key));
        }
        return result;
    }
}
