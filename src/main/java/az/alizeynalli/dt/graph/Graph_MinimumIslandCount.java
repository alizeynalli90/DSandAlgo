package az.alizeynalli.dt.graph;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Graph_MinimumIslandCount {

    public static int countMinimumIslandSize(String[][] grid) {
        Set<String> visited = new HashSet<>();
        List<Integer> islands = new ArrayList<>();
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[r].length; c++) {
                int size = explore(grid, r, c, visited);
                if (size > 0) {
                    islands.add(size);
                }
            }
        }
        islands.sort((o1, o2) -> o1 < o2 ? o1 : o2);
        return islands.get(islands.size() - 1);
    }

    private static int explore(String[][] grid, int r, int c, Set<String> visited) {
        Boolean rowInBound = 0 <= r && r < grid.length;
        Boolean colInBound = 0 <= c && c < grid[0].length;
        if (!rowInBound || !colInBound) {
            return 0;
        }
        if (grid[r][c] == "W") {
            return 0;
        }

        String position = r + "," + "c";
        if (visited.contains(position)) {
            return 0;
        }
        visited.add(position);

        int size = 0;
        size += explore(grid, r + 1, c, visited);
        size += explore(grid, r - 1, c, visited);
        size += explore(grid, r, c + 1, visited);
        size += explore(grid, r, c - 1, visited);

        return size;
    }


    public static void main(String[] args) {
        String[][] map = {
                {"W", "L", "W", "W", "W"},
                {"W", "L", "W", "W", "W"},
                {"W", "W", "W", "L", "W"},
                {"W", "W", "L", "L", "W"},
                {"L", "W", "L", "L", "L"},
                {"L", "L", "W", "W", "W"}
        };

        System.out.print(countMinimumIslandSize(map));
    }

}
