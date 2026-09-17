package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RedBlue {
    private static long max(int index , int cr , int tot , int n , int sr , int[] A){
        if(index==n){
            int cb = n - cr;
            int sb = tot - sr;

            long f = sb*cr + sr*cb;

            return f;
        }

        long take = max(index + 1 , cr + 1 , tot , n , sr + A[index] , A);
        long notTake = max(index + 1 , cr , tot , n , sr , A);

        return Math.max(take,notTake);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while(T-->0){
            int N =  Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] A = new int[N];
            int tot = 0;

            for(int i=0;i<N;i++){
                A[i] = Integer.parseInt(st.nextToken());
                tot += A[i];
            }

            long max = max(0 , 0 , tot , N , 0 , A);
            System.out.println(max);
        }
    }
}
