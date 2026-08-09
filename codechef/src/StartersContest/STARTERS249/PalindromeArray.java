package StartersContest.STARTERS249;

import java.util.*;

class PalindromeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];

            for (int i = 0; i < n; i++)
                a[i] = sc.nextLong();

            long l = Long.MIN_VALUE;
            long r = Long.MAX_VALUE;
            boolean ok = true;

            for (int i = 0; i < n / 2; i++) {
                long x = a[i];
                long y = a[n - 1 - i];

                if (x == y)
                    continue;

                if (Math.abs(x - y) != 2) {
                    ok = false;
                    break;
                }

                long s = Math.min(x, y);
                long b = Math.max(x, y);

                l = Math.max(l, s);
                r = Math.min(r, b - 1);

                if (l > r) {
                    ok = false;
                    break;
                }
            }

            System.out.println(ok ? "Yes" : "No");
        }
    }
}
