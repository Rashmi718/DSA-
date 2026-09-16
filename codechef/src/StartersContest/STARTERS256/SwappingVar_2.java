package StartersContest.STARTERS256;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SwappingVar_2 {
    private static final int MOD = 998244353;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String line = br.readLine();
        if (line == null) return;
        int t = Integer.parseInt(line.trim());

        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            line = br.readLine();
            while (line != null && line.trim().isEmpty()) {
                line = br.readLine();
            }
            if (line == null) break;

            int n = Integer.parseInt(line.trim());
            int[] pos = new int[n + 1];

            st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= n; i++) {
                int val = Integer.parseInt(st.nextToken());
                pos[val] = i;
            }

            long[] dp = new long[n + 1];
            dp[1] = 1;

            for (int i = 2; i <= n; i++) {
                long[] nextDp = new long[n + 1];
                long[] pref = new long[i];
                for (int k = 1; k < i; k++) {
                    pref[k] = (pref[k - 1] + dp[k]) % MOD;
                }

                if (pos[i - 1] < pos[i]) {
                    for (int j = 1; j <= i; j++) {
                        nextDp[j] = pref[j - 1];
                    }
                } else {
                    for (int j = 1; j <= i; j++) {
                        long sum = (pref[i - 1] - pref[j - 1] + MOD) % MOD;
                        nextDp[j] = sum;
                    }
                }
                dp = nextDp;
            }

            long total = 0;
            for (int j = 1; j <= n; j++) {
                total = (total + dp[j]) % MOD;
            }

            sb.append(total).append("\n");
        }

        System.out.print(sb);
    }
}
