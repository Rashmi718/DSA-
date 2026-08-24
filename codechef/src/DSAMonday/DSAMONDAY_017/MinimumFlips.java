package DSAMonday.DSAMONDAY_017;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MinimumFlips {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while (T-->0){
            int N =  Integer.parseInt(br.readLine());
            StringTokenizer st=new StringTokenizer(br.readLine());
            int[] A = new int[N];
            if(N % 2 != 0){
                System.out.println(-1);
                continue;
            }

            for(int i=0;i<N;i++){
                A[i]=Integer.parseInt(st.nextToken());
            }

            int pos = 0;
            int neg = 0;
            for(int i=0;i<N;i++){
                if(A[i] == 1){
                    pos++;
                }else if(A[i] == -1){
                    neg++;
                }
            }

            System.out.println(Math.abs(pos - neg) / 2);
        }
    }
}
