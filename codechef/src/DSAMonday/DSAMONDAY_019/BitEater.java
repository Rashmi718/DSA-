package DSAMonday.DSAMONDAY_019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BitEater {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] A = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }
        int M =  Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++){
            int rightShift = A[i] / (int)Math.pow(2 , M);
            A[i] = rightShift;
        }

        for(int i = 0; i < N; i++){
            System.out.print(A[i] + " ");
        }
    }
}
