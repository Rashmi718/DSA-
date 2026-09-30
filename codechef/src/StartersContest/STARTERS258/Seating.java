package StartersContest.STARTERS258;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Seating {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(r.readLine().trim());

        while (t-- > 0) {
            StringTokenizer s1 = new StringTokenizer(r.readLine());
            int n = Integer.parseInt(s1.nextToken());
            int m = Integer.parseInt(s1.nextToken());
            int k = Integer.parseInt(s1.nextToken());

            boolean[] u = new boolean[n + 1];
            StringTokenizer s2 = new StringTokenizer(r.readLine());
            for (int i = 0; i < m; i++) {
                u[Integer.parseInt(s2.nextToken())] = true;
            }

            StringBuilder o = new StringBuilder();
            int p = 1;
            for (int i = 0; i < k; i++) {
                while (u[p]) {
                    p++;
                }
                u[p] = true;
                o.append(p).append(" ");
            }
            System.out.println(o.toString().trim());
        }
    }
}

