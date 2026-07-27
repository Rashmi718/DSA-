package DSAMonday.DSAMONDAY_013;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MaximiseWoodValue {
    static int cutRodRecur(int i, int j, int[] price, int[][] dp) {

        if (i == 0 || j == 0) return 0;
        if (dp[i][j] != -1) return dp[i][j];

        int take = 0;
        if (i <= j) {
            take = price[i] + cutRodRecur(i, j - i, price, dp);
        }

        int noTake = cutRodRecur(i - 1, j, price, dp);
        return dp[i][j] = Math.max(take, noTake);
    }

    static int cutRod(int[] price) {
        int n = price.length-1;
        int[][] dp = new int[n + 1][n + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return cutRodRecur(n, n, price, dp);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        String[] parts = s.split(" ");
        int[] wood = new int[n];

        for(int i = 0; i < n ; i++){
            wood[i] = Integer.parseInt(parts[i]);
        }

        System.out.println(cutRod(wood));
    }
}
