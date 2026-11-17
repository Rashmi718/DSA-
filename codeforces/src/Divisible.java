import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Divisible {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            long n = Long.parseLong(br.readLine());
            if(n % 25 == 0){
                System.out.println(0);
                return;
            }


        }
    }
}
