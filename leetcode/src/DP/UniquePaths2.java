package DP;

import java.util.Arrays;

public class UniquePaths2 {
    static int[][] dp;
    public int uniquePathsWithObstacles(int[][] obstacleGrid){
        //down direction means x -> +1 and y -> 0
        //up direction means x -> -1 and y -> 0
        // left direction means x -> 0 and y -> -1
        //right direction means x -> 0 and y -> +1
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        dp = new int[m][n];
        for(int i = 0; i < m ; i++){
            Arrays.fill(dp[i] , -1);
        }
        return allPaths(0 , 0 , m , n , obstacleGrid);
    }

    private int allPaths(int x, int y, int m, int n, int[][] obstacle) {

        if (x >= m || y >= n)
            return 0;

        if (obstacle[x][y] == 1)
            return 0;

        if (x == m - 1 && y == n - 1)
            return 1;

        if (dp[x][y] != -1)
            return dp[x][y];

        int down = allPaths(x + 1, y, m, n, obstacle);
        int right = allPaths(x, y + 1, m, n, obstacle);

        return dp[x][y] = down + right;
    }

    public static void main(String[] args) {
        UniquePaths2 ob = new UniquePaths2();
        int[][] obs = {{0 , 0 , 0} , {0 , 1 , 0} , {0 , 0 , 0}};
        System.out.println(ob.uniquePathsWithObstacles(obs));
    }
}
