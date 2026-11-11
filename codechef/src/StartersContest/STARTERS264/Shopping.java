package StartersContest.STARTERS264;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Shopping {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            long d = Long.parseLong(st.nextToken());

            StringTokenizer s1 = new StringTokenizer(br.readLine());
            StringTokenizer s2 = new StringTokenizer(br.readLine());

            long c1 = d, c2 = d, c3 = 2 * d;

            for (int i = 0; i < n; i++) {
                long x = Long.parseLong(s1.nextToken());
                long y = Long.parseLong(s2.nextToken());
                c1 += x;
                c2 += y;
                c3 += (x < y ? x : y);
            }

            long ans = c1 < c2 ? c1 : c2;
            if (c3 < ans) ans = c3;

            System.out.println(ans);
        }
    }
}
