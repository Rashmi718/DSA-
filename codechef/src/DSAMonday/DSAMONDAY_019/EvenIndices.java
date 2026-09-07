package DSAMonday.DSAMONDAY_019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class EvenIndices {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] A = new int[N];
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int sum = 0;

        for(int i = 0; i < N; i++){
            A[i] = Integer.parseInt(st2.nextToken());

            if(i % 2 == 0){
                if(A[i] / 2 > K){
                    sum += A[i];
                }
            }
        }
        System.out.println(sum);
    }
}
