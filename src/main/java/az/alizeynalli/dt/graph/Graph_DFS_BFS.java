package az.alizeynalli.dt.graph;

import java.util.*;

public class Graph_DFS_BFS {

    public static void dfsIt(Map<String, String[]> graph, String start) {
        Stack<String> stack = new Stack<>();
        stack.push(start);
        while (stack.size() > 0) {
            String current = stack.pop();
            System.out.println(current);
            for (String neighbor : graph.get(current)) {
                stack.push(neighbor);
            }
        }
    }

    public static void bfs(Map<String, String[]> graph, String start) {
        Queue<String> queue = new LinkedList<>();
        queue.add(start);
        while (!queue.isEmpty()) {
            String current = queue.poll();
            System.out.println(current);
            for (String neighbor : graph.get(current)) {
                queue.add(neighbor);
            }
        }
    }

    public static void dfsRec(Map<String, String[]> graph, String start) {
        // base case is node without neighbors like e or f
        System.out.println(start);
        for (String neighbor : graph.get(start)) {
            dfsRec(graph, neighbor);
        }
    }

    // public static int countConnectedCompount(Map<Integer, Integer[]> graph){ }

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
        System.out.println("+++BFS Iterative+++");
        dfsIt(graph, "a");
        System.out.println("+++BFS Recursive+++");
        dfsRec(graph, "a");
        System.out.println("+++DFS+++");
        bfs(graph, "a");
    }
}
