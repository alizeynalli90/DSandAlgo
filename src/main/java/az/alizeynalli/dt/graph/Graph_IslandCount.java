package az.alizeynalli.dt.graph;

import java.util.HashSet;
import java.util.Set;

public class Graph_IslandCount {

    public static int countIslands(String[][] grid) {
        Set<String> visited = new HashSet<>();
        int count = 0;
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[r].length; c++) {
                if (explore(grid, r, c, visited)) {
                    count++;
                }
            }
        }
        return count;
    }

    private static boolean explore(String[][] grid, int r, int c, Set<String> visited) {
        Boolean rowInBound = 0 <= r && r < grid.length;
        Boolean colInBound = 0 <= c && c < grid[0].length;
        if (!rowInBound || !colInBound) {
            return false;
        }
        if (grid[r][c] == "W") {
            return false;
        }

        String position = r + "," + "c";
        if (visited.contains(position)) {
            return false;
        }
        visited.add(position);

        explore(grid, r + 1, c, visited);
        explore(grid, r - 1, c, visited);
        explore(grid, r, c + 1, visited);
        explore(grid, r, c - 1, visited);

        return true;
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

        System.out.println(countIslands(map));
    }
}
