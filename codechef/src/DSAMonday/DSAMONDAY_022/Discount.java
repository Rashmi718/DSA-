package DSAMonday.DSAMONDAY_022;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Discount {

    private static long Helper(int index, String s, int flag, long currentVal) {
        if (index == s.length()) {
            return currentVal;
        }
        if (index != flag) {
            int digit = s.charAt(index) - '0';
            currentVal = currentVal * 10 + digit;
        }
        return Helper(index + 1, s, flag, currentVal);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            String s = String.valueOf(N);

            long min = Long.MAX_VALUE;

            for(int i = 0; i < s.length(); i++){
                min =  Math.min(min, Helper(0, s, i , 0));
            }
            System.out.println(min);
        }
    }
}