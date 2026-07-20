package DP;

import java.util.Arrays;

public class MinimumPathSum {

    static int[][] dp;
    public int minPathSum(int[][] grid) {
        //allowed direction is down and right
        //minimum sum to reach (0 , 0) to (m - 1 , n - 1)

        int m = grid.length;
        int n = grid[0].length;
        dp = new int[m][n];
        for (int i = 0 ; i < m ; i++){
            Arrays.fill(dp[i] , -1);
        }
        return minSum(0 , 0 , m , n , grid);
    }

    private int minSum(int x, int y, int m, int n, int[][] grid) {

        if (x >= m || y >= n)
            return Integer.MAX_VALUE;

        if (x == m - 1 && y == n - 1)
            return grid[x][y];

        if(dp[x][y] != -1) return dp[x][y];

        int down = minSum(x + 1, y, m, n, grid);
        int right = minSum(x, y + 1, m, n, grid);

        return dp[x][y] = grid[x][y] + Math.min(down, right);
    }

    public static void main(String[] args) {
        MinimumPathSum ob = new MinimumPathSum();
        int[][] grid = {{1 , 3 ,1} , {1 , 5 , 1} , {4 , 2 , 1}};
        System.out.println(ob.minPathSum(grid));
    }
}
