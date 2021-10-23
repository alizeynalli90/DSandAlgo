package az.alizeynalli.dt.graph;

import java.util.*;

public class Graph_HashPath {


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

    public static boolean hasPathDFSCyclic(Map<String, String[]> graph, String start, String destination, Set<String> set) {
        if (start == destination) {
            return true;
        }
        if (set.contains(start)) return false;
        set.add(start);

        // base case is node without neighbors like e or f

        for (String neighbor : graph.get(start)) {
            if (hasPathDFSCyclic(graph, neighbor, destination, set) == true) return true;
        }
        return false;
    }

    public static boolean hasPathDFS(Map<String, String[]> graph, String start, String destination) {
        if (start == destination) {
            return true;
        }
        // base case is node without neighbors like e or f

        for (String neighbor : graph.get(start)) {
            if (hasPathDFS(graph, neighbor, destination) == true) return true;
        }
        return false;
    }

    public static boolean hasPathDFSIT(Map<String, String[]> graph, String start, String destination) {
        Stack<String> stack = new Stack<>();
        stack.push(start);
        while (stack.size() > 0) {
            String current = stack.pop();
            if (current == destination) {
                return true;
            }
            for (String neighbor : graph.get(current)) {
                stack.push(neighbor);
            }
        }
        return false;
    }


    public static boolean hasPathBFS(Map<String, String[]> graph, String start, String destination) {
        Queue<String> queue = new LinkedList<>();
        queue.add(start);
        while (!queue.isEmpty()) {
            String current = queue.poll();
            if (current == destination) {
                return true;
            }
            for (String neighbor : graph.get(current)) {
                queue.add(neighbor);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Map<String, String[]> graph = new HashMap<>();
        String[] a = {"b", "c"};
        graph.put("a", a);
        String[] b = {"d"};
        graph.put("b", b);
        String[] c = {"e"};
        graph.put("c", c);
        String[] d = {"f"};
        graph.put("d", d);
        String[] e = {};
        graph.put("e", e);
        String[] f = {};
        graph.put("f", f);
        System.out.println("+++DFS+++");
        System.out.println(hasPathDFS(graph, "a", "d"));
        System.out.println("+++DFS+++");
        System.out.println(hasPathDFSIT(graph, "a", "d"));
        System.out.println("+++BFS+++");
        System.out.println(hasPathBFS(graph, "a", "d"));

        System.out.println("+++Graph Building from Edges+++");
        String[][] edges = {{"i", "j"}, {"k", "i"}, {"m", "k"}, {"k", "l"}, {"o", "n"}};

        System.out.println("+++Cyclic Graph Path Finding+++");
        Map<String, String[]> cyclicGraph = buildGraph(edges);
        System.out.println(hasPathDFSCyclic(cyclicGraph, "j", "k", new HashSet<>()));
    }
}
