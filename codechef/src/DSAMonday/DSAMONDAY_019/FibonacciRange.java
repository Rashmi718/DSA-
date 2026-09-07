package DSAMonday.DSAMONDAY_019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FibonacciRange {
    static final int M = 1000000007;

    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer t = new StringTokenizer(r.readLine());
        int n = Integer.parseInt(t.nextToken());
        int q = Integer.parseInt(t.nextToken());

        t = new StringTokenizer(r.readLine());
        int[] a = new int[n];
        int mx = 0;
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(t.nextToken());
            if (a[i] > mx) mx = a[i];
        }

        int[] f = new int[Math.max(3, mx + 1)];
        f[1] = 1;
        f[2] = 1;
        for (int i = 3; i <= mx; i++) {
            f[i] = (f[i - 1] + f[i - 2]) % M;
        }

        long[] p = new long[n + 1];
        for (int i = 1; i <= n; i++) {
            p[i] = (p[i - 1] + f[a[i - 1]]) % M;
        }

        StringBuilder o = new StringBuilder();
        for (int i = 0; i < q; i++) {
            t = new StringTokenizer(r.readLine());
            int l = Integer.parseInt(t.nextToken());
            int k = Integer.parseInt(t.nextToken());
            o.append((p[k] - p[l - 1] + M) % M).append("\n");
        }
        System.out.print(o);
    }
}
