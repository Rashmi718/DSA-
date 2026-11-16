import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            String[] targets = {"00", "25", "50", "75"};
            while (t-- > 0) {
                String s = sc.next();
                int minRemovals = Integer.MAX_VALUE;
                for (String target : targets) {
                    minRemovals = Math.min(minRemovals, getOperations(s, target));
                }
                System.out.println(minRemovals);
            }
        }
        sc.close();
    }

    private static int getOperations(String s, String target) {
        int operations = 0;
        int targetIdx = 1;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == target.charAt(targetIdx)) {
                targetIdx--;
                if (targetIdx < 0) {
                    return operations;
                }
            } else {
                operations++;
            }
        }
        return Integer.MAX_VALUE;
    }
}

