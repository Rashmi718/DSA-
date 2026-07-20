package DP;

import java.util.Arrays;

public class UniquePaths {
    static int[][] dp;
    public int uniquePaths(int m , int n){
        //down direction means x -> +1 and y -> 0
        //right direction means x -> 0 and y -> +1
        dp = new int[m][n];
        for(int i = 0; i < m ; i++){
            Arrays.fill(dp[i] , -1);
        }
        return allPaths(0 , 0 , m , n);
    }

    private int allPaths(int x , int y , int m , int n){
        if(x == m - 1 && y == n - 1) {
            return 1;
        }
        if(dp[x][y] != -1) return dp[x][y];

        int path = 0;
        if (x + 1 < m) {
            path += allPaths(x + 1, y, m, n);
        }
        if (y + 1 < n) {
            path += allPaths(x, y + 1, m, n);
        }

        return dp[x][y] = path;
    }

    public static void main(String[] args) {
        UniquePaths ob = new UniquePaths();
        System.out.println(ob.uniquePaths(3 , 2));
    }
}
