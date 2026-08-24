package DSAMonday.DSAMONDAY_017;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class WithinReach {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new  StringTokenizer(br.readLine());
        int X =  Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());
        int K =  Integer.parseInt(st.nextToken());

        if(X + K == Y || X - K == Y){
            System.out.println("YES");
        } else if (X == Y){
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }
    }
}
