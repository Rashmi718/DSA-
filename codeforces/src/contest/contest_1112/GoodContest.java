package contest.contest_1112;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class GoodContest {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] A = new int[3];

            for (int i = 0; i < 3; i++) {
                A[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(A);

            System.out.println(n - A[0]);
        }
    }
}
