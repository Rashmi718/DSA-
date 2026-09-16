package StartersContest.STARTERS256;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class MaxSum {
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
            long[] a = new long[n];
            long totalSum = 0;

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(st.nextToken());
                totalSum += a[i];
            }

            Arrays.sort(a);

            long[] pref = new long[n + 1];
            for (int i = 0; i < n; i++) {
                pref[i + 1] = pref[i] + a[i];
            }

            long maxVal = 0;

            for (int k = 1; k < n; k++) {
                long cr = k;
                long cb = n - k;

                long srMin = pref[k];
                long sbMin = totalSum - srMin;
                long val1 = srMin * cb + sbMin * cr;

                long srMax = pref[n] - pref[n - k];
                long sbMax = totalSum - srMax;
                long val2 = srMax * cb + sbMax * cr;

                maxVal = Math.max(maxVal, Math.max(val1, val2));
            }

            sb.append(maxVal).append("\n");
        }

        System.out.print(sb);
    }
}
