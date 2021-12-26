package az.alizeynalli.leetcodeproblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// https://leetcode.com/problems/all-paths-from-source-to-target/
public class Graph_AllPathsToTarget {
    public static List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        list.add(0);
        dfs(graph, res, list, 0);
        return res;
    }

    private static void dfs(int[][] graph, List<List<Integer>> res, List<Integer> list, Integer current){
        if(current == graph.length -1){
            res.add(new ArrayList<>(list));
        }
        for(Integer el: graph[current]){
            list.add(el);
            dfs(graph, res, list, el);
            list.remove(list.size() -1);
        }
    }

    public static void main(String[] args) {
        int[][] graph = {{4,3,1},{3,2,4},{3},{4},{}};
        System.out.println(allPathsSourceTarget(graph));
    }
}
