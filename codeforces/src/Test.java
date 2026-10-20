import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            long n = Long.parseLong(st.nextToken());
            long k = Long.parseLong(st.nextToken());
            long x = Long.parseLong(st.nextToken());

            // Calculate the minimum possible sum of k distinct elements
            long minSum = k * (k + 1) / 2;

            // Calculate the maximum possible sum of k distinct elements
            long maxSum = k * (2 * n - k + 1) / 2;

            if (x >= minSum && x <= maxSum) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
