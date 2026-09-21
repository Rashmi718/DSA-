package contest.contest_1112;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class RoadRepair {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            HashSet<Long> set = new HashSet<>();

            for (int i = 1; i <= n; i++) {
                long x = Long.parseLong(st.nextToken());
                set.add(x - i);
            }

            int ans = 0;
            for (long x : set) {
                if (!set.contains(x - 1)) {
                    long current = x;
                    int length = 1;
                    while (set.contains(current + 1)) {
                        current++;
                        length++;
                    }

                    ans = Math.max(ans, length);
                }
            }

            System.out.println(ans);
        }
    }
}
