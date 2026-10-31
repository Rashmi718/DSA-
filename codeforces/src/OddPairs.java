import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class OddPairs {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int q = Integer.parseInt(st.nextToken());

            long[] pref = new long[n + 1];
            st = new StringTokenizer(br.readLine());

            for (int i = 1; i <= n; i++) {
                long val = Long.parseLong(st.nextToken());
                pref[i] = pref[i - 1] + val;
            }

            long totalSum = pref[n];

            for (int i = 0; i < q; i++) {
                st = new StringTokenizer(br.readLine());
                int l = Integer.parseInt(st.nextToken());
                int r = Integer.parseInt(st.nextToken());
                long k = Long.parseLong(st.nextToken());

                long rangeSum = pref[r] - pref[l - 1];
                long newSum = totalSum - rangeSum + (r - l + 1) * k;
                if (newSum % 2 != 0) {
                    sb.append("YES\n");
                } else {
                    sb.append("NO\n");
                }
            }
        }
        System.out.print(sb);
    }
}
