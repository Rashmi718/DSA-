package StartersContest.STARTERS254;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MaximumSum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(st2.nextToken());
            }

            int w = n - k;
            long s = 0;
            for (int i = 0; i < w; i++) {
                s += a[i];
            }

            long m = s;

            for (int i = w; i < n; i++) {
                s += a[i] - a[i - w];
                if (s > m) {
                    m = s;
                }
            }

            System.out.println(m);
        }
    }
}
