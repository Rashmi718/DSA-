package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ChopSticks {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        long D = Long.parseLong(st.nextToken());

        Long[] arr = new Long[n];
        for(int i = 0; i < n; i++){
            arr[i] = Long.parseLong(br.readLine());
        }

        long count = 0;
        Arrays.sort(arr);
        for(int i = 1; i < n; i++){
            long diff = Math.abs(arr[i] - arr[i - 1]);
            if(diff <= D) {
                count++;
                i++;
            }
        }

        System.out.println(count);
    }
}
