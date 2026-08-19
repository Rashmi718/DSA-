package DSAMonday.DSAMONDAY_016;

import java.io.*;
import java.util.*;

public class MaximumDivisorScore {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] a = new int[n];
        int max = 0;

        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max, a[i]);
        }

        int[] divisorCount = new int[max + 1];

        for (int i = 1; i <= max; i++) {

            for (int j = i; j <= max; j += i) {
                divisorCount[j]++;
            }
        }


        long[] dp = new long[max + 1];
        long answer = 0;
        for (int x : a) {
            long bestPrevious = 0;
            if (x - 1 >= 1) {
                bestPrevious = Math.max(bestPrevious, dp[x - 1]);
            }
            if (x + 1 <= max) {
                bestPrevious = Math.max(bestPrevious, dp[x + 1]);
            }
            if (x % 2 == 0) {
                bestPrevious = Math.max(bestPrevious, dp[x / 2]);
            }

            if (2 * x <= max) {
                bestPrevious = Math.max(bestPrevious, dp[2 * x]);
            }
            if (x % 3 == 0) {
                bestPrevious = Math.max(bestPrevious, dp[x / 3]);
            }

            if (3 * x <= max) {
                bestPrevious = Math.max(bestPrevious, dp[3 * x]);
            }
            dp[x] = Math.max(dp[x], bestPrevious + divisorCount[x]);
            answer = Math.max(answer, dp[x]);
        }
        System.out.println(answer);
    }
}