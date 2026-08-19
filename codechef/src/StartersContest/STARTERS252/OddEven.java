package StartersContest.STARTERS252;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class OddEven {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T  = Integer.parseInt(br.readLine());

        while(T-- > 0){
            int n  = Integer.parseInt(br.readLine());
            int[] A = new int [n];
            StringTokenizer st = new StringTokenizer(br.readLine());

            int even = 0;
            int odd = 0;

            for(int i = 0; i < n; i++){
                A[i] = Integer.parseInt(st.nextToken());
                if(A[i] % 2 == 0){
                    even++;
                }else {
                    odd++;
                }
            }

            if(even == odd){
                System.out.println(n);
            }else{
                int res = Math.min(odd,even);
                System.out.println(2 * res + 1);
            }
        }
    }
}
