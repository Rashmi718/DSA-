package contest.DIV3.Wednesday_oct7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x0 = Integer.parseInt(st.nextToken());
            int y0 = Integer.parseInt(st.nextToken());
            int router = Integer.parseInt(st.nextToken());

            int x1 = 0;
            int y1 = 0;
            boolean found = false;

            for (int i = x0 - router; i <= x0 + router; i++) {
                for (int j = y0 - router; j <= y0 + router; j++) {
                    int lhs = (x0 - i) * (x0 - i) + (y0 - j) * (y0 - j);
                    int rhs = router * router;

                    if (lhs == rhs) {
                        x1 = i;
                        y1 = j;
                        found = true;
                        break;
                    }
                }
                if (found) {
                    break;
                }
            }
            System.out.println(x1 + " " + y1);
        }
    }
}

