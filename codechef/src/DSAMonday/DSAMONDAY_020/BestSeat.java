package DSAMonday.DSAMONDAY_020;

import java.util.*;
import java.io.*;

class BestSeat {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        if (s == null || s.trim().isEmpty()) return;

        int n = Integer.parseInt(s.trim());
        long[] a = new long[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        long mn = Long.MAX_VALUE, mx = Long.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            a[i] = Long.parseLong(st.nextToken());
            if (a[i] < mn) mn = a[i];
            if (a[i] > mx) mx = a[i];
        }

        double c = (mn + mx) / 2.0;
        long ans = a[0];
        double d = Math.abs(a[0] - c);

        for (int i = 1; i < n; i++) {
            double cur = Math.abs(a[i] - c);
            if (cur < d) {
                d = cur;
                ans = a[i];
            } else if (Math.abs(cur - d) < 1e-9 && a[i] < ans) {
                ans = a[i];
            }
        }
        System.out.println(ans);
    }
}

