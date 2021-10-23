package az.alizeynalli.dt.graph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Graph_LargestComponent {

    public static int findLargest(Map<Integer, Integer[]> graph) {
        Set<Integer> visited = new HashSet<>();
        int result = 0;
        for (Integer el : graph.keySet()) {
            result = Math.max(result, explore(graph, el, visited));
        }
        return result;
    }

    private static int explore(Map<Integer, Integer[]> graph, Integer current, Set<Integer> visited) {
        if (visited.contains(current)) {
            return 0;
        }
        visited.add(current);
        int count = 1;
        for (Integer actual : graph.get(current)) {
            count += explore(graph, actual, visited);
        }
        return count;
    }

    public static void main(String[] args) {
        Map<Integer, Integer[]> graph = new HashMap<>();

        Integer[] zero = {8, 1, 5};
        Integer[] one = {0};
        Integer[] two = {3, 4};
        Integer[] three = {2, 4};
        Integer[] five = {0, 8};
        Integer[] four = {3, 2};
        Integer[] eight = {0, 5};

        graph.put(0, zero);
        graph.put(4, four);
        graph.put(8, eight);
        graph.put(3, three);
        graph.put(5, five);
        graph.put(1, one);
        graph.put(2, two);

        System.out.println(findLargest(graph));
    }
}
