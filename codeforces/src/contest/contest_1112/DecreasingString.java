package contest.contest_1112;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DecreasingString {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {

            int n = Integer.parseInt(br.readLine());
            String s = br.readLine();

            int zeros = 0;

            for (char c : s.toCharArray()) {
                if (c == '0') {
                    zeros++;
                }
            }

            if (s.charAt(0) == '1') {
                System.out.println(zeros);
                continue;
            }

            int firstOne = s.indexOf('1');

            if (firstOne == -1) {
                System.out.println(0);
                continue;
            }

            int onesLeft = 0;
            int zerosRight = zeros;
            int ans = n;

            for (int i = 0; i < n; i++) {

                if (s.charAt(i) == '1') {
                    onesLeft++;
                } else {
                    zerosRight--;
                }

                if (i >= firstOne - 1) {
                    ans = Math.min(ans, onesLeft + zerosRight);
                }
            }

            System.out.println(ans);
        }
    }
}