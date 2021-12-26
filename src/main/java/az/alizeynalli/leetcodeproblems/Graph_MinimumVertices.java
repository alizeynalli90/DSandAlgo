package az.alizeynalli.leetcodeproblems;

import java.util.*;
import java.util.stream.Collectors;

// https://leetcode.com/problems/minimum-number-of-vertices-to-reach-all-nodes/
public class Graph_MinimumVertices {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        Set<Integer> start = new HashSet<>();
        Map<Integer,Integer> end = new HashMap<>();
        for (List<Integer> el: edges) {
            start.add(el.get(0));
            end.put(el.get(1), 0);
        }
        return start.stream().filter(el -> !end.containsKey(el)).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        int[][] edges = {{0,1},{0,2},{2,5},{3,4},{4,2}};
    }
}
