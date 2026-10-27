import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Raspberries {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            StringTokenizer ele = new StringTokenizer(br.readLine());
            int evenCount = 0;
            int minOps = Integer.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                int val = Integer.parseInt(ele.nextToken());
                if (val % 2 == 0) {
                    evenCount++;
                }
                int rem = val % k;
                int opsNeeded = (rem == 0) ? 0 : (k - rem);

                if (opsNeeded < minOps) {
                    minOps = opsNeeded;
                }
            }

            if (k == 4) {
                int opsForTwoEvens = Math.max(0, 2 - evenCount);
                minOps = Math.min(minOps, opsForTwoEvens);
            }
            System.out.println(minOps);
        }
    }
}
