package az.alizeynalli.leetcodeproblems;

import java.util.ArrayList;
import java.util.List;

public class Graph_AllPaths {
    public static List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> result = new ArrayList<>();
        result = find(graph, 0, graph.length - 1, result, new ArrayList<>());
        return result;
    }

    private static List<List<Integer>> find(int[][] graph, int start, int dest, List<List<Integer>> result, List<Integer> path) {
        if (start == dest) {
            path.add(start);
            result.add(path);

            return result;
        }

        for (int el : graph[start]) {
            path.add(start);
            find(graph, el, dest, result, path);
            path = new ArrayList<>();
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] graph = {{4, 3, 1}, {3, 2, 4}, {3}, {4}, {}};
        List<List<Integer>> result = allPathsSourceTarget(graph);
    }
}
