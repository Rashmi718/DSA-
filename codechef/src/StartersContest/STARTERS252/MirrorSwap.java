package StartersContest.STARTERS252;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MirrorSwap {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());

            int total = 2 * n;
            int[] A = new int[total];
            for (int i = 0; i < total; i++) {
                if (st.hasMoreTokens()) {
                    A[i] = Integer.parseInt(st.nextToken());
                }
            }

            int left = 0;
            int right = total - 1;
            int sum = 0;

            while (right > left) {
                if (A[right] >= A[left]) {
                    sum += A[right];
                } else {
                    sum += A[left];
                }
                right--;
                left++;
            }

            System.out.println(sum);
        }
    }
}
