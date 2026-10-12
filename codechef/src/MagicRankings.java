import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class MagicRankings {
    private static final int INF = -1000000000;

    private static int helper(int i , int j , int n , int[][] arr , int[][] dp){
        if (i > n || j > n) {
            return INF;
        }

        if (i == n && j == n) {
            return arr[i][j];
        }

        if (dp[i][j] != Integer.MIN_VALUE) {
            return dp[i][j];
        }

        int left = helper(i , j + 1 , n , arr , dp);
        int down = helper(i + 1 , j , n , arr , dp);

        int maxFuture = Math.max(left, down);
        if (maxFuture <= INF / 2) {
            return dp[i][j] = INF;
        }

        return dp[i][j] = arr[i][j] + maxFuture;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int[][] arr = new int[n + 1][n + 1];

            for(int i = 1; i <= n; i++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                for(int j = 1; j <= n; j++){
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int[][] dp = new int[n + 1][n + 1];
            for(int i = 1; i <= n; i++){
                Arrays.fill(dp[i], Integer.MIN_VALUE);
            }

            double res = (double) helper(1 , 1 , n , arr , dp) / (2 * n - 3);
            if(res < 0){
                System.out.println("Bad Judges");
            } else {
                System.out.printf("%.6f\n", res);
            }
        }
    }
}