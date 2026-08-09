package StartersContest.STARTERS249;

import java.util.Scanner;

public class ProductExceeded {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            long x = sc.nextLong();
            long y = sc.nextLong();
            long z = sc.nextLong();

            int ans = 0;

            while (x * y < z) {
                if (x < y) {
                    x++;
                } else {
                    y++;
                }
                ans++;
            }

            System.out.println(ans);
        }
    }
}