package StartersContest.STARTERS252;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import java.io.*;
import java.util.*;

class SkipOne {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int coins = Integer.parseInt(st.nextToken());

            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int[] A = new int[n];
            for (int i = 0; i < n; i++) {
                A[i] = Integer.parseInt(st2.nextToken());
            }

            int total = 0;
            int skip = 1;
            int max= 0;

            for (int i = 0; i < n; i++) {
                if (A[i] <= coins) {
                    total++;
                    coins -= A[i];
                    max = Math.max(max, A[i]);
                } else {
                    if (skip != 0) {
                        if (max > A[i]) {
                            coins += max;
                            coins -= A[i];
                            max = A[i];
                        }

                        total++;
                        skip--;
                    } else {
                        break;
                    }
                }
            }

            System.out.println(total);
        }
    }
}
