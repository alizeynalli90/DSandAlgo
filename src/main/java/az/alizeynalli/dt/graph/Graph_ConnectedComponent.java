package az.alizeynalli.dt.graph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Graph_ConnectedComponent {

    public static int count(Map<Integer, Integer[]> graph) {
        Set<Integer> visited = new HashSet<>();
        int count = 0;
        for (Integer el : graph.keySet()) {
            if (explore(graph, el, visited)) {
                count++;
            }
        }
        return count;
    }

    private static boolean explore(Map<Integer, Integer[]> graph, Integer current, Set<Integer> visited) {
        if (visited.contains(current)) {
            return false;
        }
        visited.add(current);
        for (Integer neighbor : graph.get(current)) {
            explore(graph, neighbor, visited);
        }
        return true;
    }

    public static void main(String[] args) {
        Map<Integer, Integer[]> graph = new HashMap<>();

        Integer[] three = {};
        Integer[] four = {6};
        Integer[] six = {4, 5, 7, 8};
        Integer[] eight = {6};
        Integer[] seven = {6};
        Integer[] five = {6};
        Integer[] one = {2};
        Integer[] two = {1};
        graph.put(3, three);
        graph.put(4, four);
        graph.put(6, six);
        graph.put(8, eight);
        graph.put(7, seven);
        graph.put(5, five);
        graph.put(1, one);
        graph.put(2, two);

        System.out.println(count(graph));
    }
}
