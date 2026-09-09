package StartersContest.STARTERS255;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class AdditiveDissonance {

    /* private static int minimumMaximumFrequency(long[] arr){
        long max = Arrays.stream(arr).max().getAsLong();
        long min = Arrays.stream(arr).min().getAsLong();

        int res = arr.length;
        for(long i = 0; i <= max - min; i++){
            res = Math.min(res , findFrequency(arr , i , 0 , new HashMap<>()));
        }

        return res;
    }

    private static int findFrequency(long[] arr , long x , int index , HashMap<Long, Integer> map){
        if(index == arr.length){
            int maxF = 0;
            for(int c : map.values()){
                maxF = Math.max(maxF,c);
            }

            return maxF;
        }

        int res = Integer.MAX_VALUE;
        long v1 = arr[index] - x;
        map.put(v1, map.getOrDefault(v1, 0) + 1);
        res = Math.min(res, findFrequency(arr, x, index + 1, map));
        map.put(v1, map.getOrDefault(v1, 0) - 1);
        if(map.get(v1) == 0) map.remove(v1);

        long v2 = arr[index] + x;
        map.put(v2, map.getOrDefault(v2, 0) + 1);
        res = Math.min(res, findFrequency(arr, x, index + 1, map));
        map.put(v2, map.getOrDefault(v2, 0) - 1);
        if(map.get(v2) == 0) map.remove(v2);

        return res;
    }

     */

    private static int solve(long[] arr) {
        HashMap<Long, Integer> map = new HashMap<>();

        int maxF = 0;

        for (long x : arr) {
            int f = map.getOrDefault(x, 0) + 1;
            map.put(x, f);

            maxF = Math.max(maxF, f);
        }

        return (maxF + 1) / 2;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while(T-- > 0){
            int N =  Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            long[] arr = new long[N];
            for(int i = 0; i < N; i++){
                arr[i] = Long.parseLong(st.nextToken());
            }

            System.out.println(solve(arr));
        }
    }
}
