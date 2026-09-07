package DSAMonday.DSAMONDAY_019;

import com.sun.source.tree.BinaryTree;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BalanceTowers {
    public static int getMinDiff(int[] arr, int k) {
        int n = arr.length;
        Arrays.sort(arr);
        int res = arr[n - 1] - arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - k < 0)
                continue;
            int minH = Math.min(arr[0] + k, arr[i] - k);
            int maxH = Math.max(arr[i - 1] + k, arr[n - 1] - k);
            res = Math.min(res, maxH - minH);
        }

        return res;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st2.nextToken());
        }

        System.out.println(getMinDiff(arr, K));
    }
}
