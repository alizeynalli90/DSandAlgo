package az.alizeynalli.leetcodeproblems;

// https://leetcode.com/problems/number-of-provinces/
public class Graph_NumberOfProvinces {

    public static int findCircleNum(int[][] M) {
        int N = M.length;
        boolean[]visited = new boolean[N];
        int count = 0;

        for(int i = 0; i < N ;i++){
            if(!visited[i]){
                count++;
                dfs(M,i,visited);
            }
        }
        return count;
    }


    private static void dfs(int[][]M,int i,boolean[]visited){
        for(int j = 0 ; j < M[i].length ; j++){
            if(!visited[j] && M[i][j] != 0){
                visited[j] = true;
                dfs(M,j,visited);
            }
        }
    }

    public static void main(String[] args) {
        int[][] provinces = {{1,1,0},{1,1,0},{0,0,1}}; // 2
        System.out.println(findCircleNum(provinces));

    }
}
