package DSAMonday.DSAMONDAY_022;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class MinimumString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        if (s == null) return;
        int k = Integer.parseInt(br.readLine());

        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int f : freq) {
            if (f > 0) {
                maxHeap.add(f);
            }
        }

        while (k > 0 && !maxHeap.isEmpty()) {
            int top = maxHeap.poll();
            top--;
            k--;
            if (top > 0) {
                maxHeap.add(top);
            }
        }

        long cost = 0;
        while (!maxHeap.isEmpty()) {
            long f = maxHeap.poll();
            cost += f * f;
        }

        System.out.println(cost);
    }
}
