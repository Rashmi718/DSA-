package StartersContest.STARTERS256;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FixedPoints {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while(T-->0){
            StringTokenizer  st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            if(K >= 0 && K <= N - 2){
                System.out.println("Yes");
            }else if (K == N){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}
