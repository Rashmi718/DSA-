package contest.contestDiv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Treasury {
    private static int gcd(int x , int y){
        if(y  == 0) return x;
        return gcd(y ,  x % y);
    }

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while(T-->0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());

            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int[] f = new int[n];

            for(int i = 0; i < n; i++){
                f[i] = Integer.parseInt(st2.nextToken());
            }


        }
    }
}
