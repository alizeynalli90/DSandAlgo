package az.alizeynalli.dt.graph;

import java.util.*;

public class Graph_ShortestPath {

    public static Map<String, String[]> buildGraph(String[][] edges) {
        Map<String, List<String>> graph = new HashMap<>();
        for (String[] element : edges) {
            if (graph.containsKey(element[0])) {
                graph.get(element[0]).add(element[1]);
            } else {
                List<String> list = new ArrayList<>();
                list.add(element[1]);
                graph.put(element[0], list);
            }
            if (graph.containsKey(element[1])) {
                graph.get(element[1]).add(element[0]);
            } else {
                List<String> list = new ArrayList<>();
                list.add(element[0]);
                graph.put(element[1], list);
            }
        }
        Map<String, String[]> result = new HashMap<>();
        for (String el : graph.keySet()) {
            String[] temp = graph.get(el).toArray(new String[graph.get(el).size()]);
            result.put(el, temp);
        }
        return result;
    }

    public static int findShortestPath(Map<String, String[]> graph, String A, String B) {
        Set<String> visited = new HashSet<>();

        visited.add(A);
        Queue<Object[]> queue = new LinkedList<>();
        Object[] distance = {A, 0};
        queue.add(distance);

        while (!queue.isEmpty()) {
            Object[] current = queue.poll();
            if (current[0] == B) {
                return (Integer) current[1];
            }
            for (String el : graph.get(current[0])) {
                if (!visited.contains(el)) {
                    visited.add(el);
                    Object[] next = {el, (((Integer) current[1]) + 1)};
                    queue.add(next);
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("+++Graph Building from Edges+++");
        String[][] edges = {{"w", "x"}, {"x", "y"}, {"z", "y"}, {"z", "v"}, {"w", "v"}};

        System.out.println("+++Cyclic Graph Path Finding+++");
        Map<String, String[]> builtGraph = buildGraph(edges);
        System.out.println(findShortestPath(builtGraph, "w", "v"));
    }
}
