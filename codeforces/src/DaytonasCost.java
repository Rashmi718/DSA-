import java.io.*;
import java.util.*;

public class DaytonasCost {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());

            boolean found = false;

            for (int i = 0; i < n; i++) {
                int x = Integer.parseInt(st.nextToken());

                if (x == k) {
                    found = true;
                }
            }

            System.out.println(found ? "YES" : "NO");
        }
    }
}