package contest.BegineerContest478;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Grapes {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] A = new int[N];
        boolean f = true;
        while (f) {
            for(int i = 0; i % N < N; i++) {

                if(M > 0){
                    A[i % N] = A[i % N] + 1;
                    M--;
                }else{
                   f = false;
                   break;
                }
            }
        }

        for(int i = 0; i < N; i++) {
            System.out.println(A[i]);
        }
    }
}
