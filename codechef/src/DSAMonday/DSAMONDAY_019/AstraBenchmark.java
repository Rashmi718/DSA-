package DSAMonday.DSAMONDAY_019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AstraBenchmark {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        int tot = A + B;
        if(tot >= X){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
