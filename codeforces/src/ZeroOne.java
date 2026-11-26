import java.util.Scanner;

public class ZeroOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()) {
            int t = sc.nextInt();

            while (t-- > 0) {
                String s = sc.next();
                int zeros = 0;
                int ones = 0;

                for (int i = 0; i < s.length(); i++) {
                    if (s.charAt(i) == '0') {
                        zeros++;
                    } else {
                        ones++;
                    }
                }

                int totalMoves = Math.min(zeros, ones);

                if (totalMoves % 2 == 1) {
                    System.out.println("DA");
                } else {
                    System.out.println("NET");
                }
            }
        }
        sc.close();
    }
}
