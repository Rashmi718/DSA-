import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ReachOne {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int t = Integer.parseInt(st.nextToken());
        StringBuilder out = new StringBuilder();

        while (t-- > 0) {
            while (!st.hasMoreTokens()) {
                st = new StringTokenizer(br.readLine());
            }
            long n = Long.parseLong(st.nextToken());

            int cnt2 = 0;
            int cnt3 = 0;

            while (n % 2 == 0) {
                n /= 2;
                cnt2++;
            }
            while (n % 3 == 0) {
                n /= 3;
                cnt3++;
            }

            if (n == 1 && cnt2 <= cnt3) {
                out.append(2 * cnt3 - cnt2).append('\n');
            } else {
                out.append("-1\n");
            }
        }

        System.out.print(out);
    }
}

