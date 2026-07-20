import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GameWithIntegers {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static String next() throws Exception{
        while( st == null || !st.hasMoreTokens()){
            st = new StringTokenizer(br.readLine());
        }
        return st.nextToken();
    }

    public static void main(String[] args) throws Exception{
        int T = Integer.parseInt(next());
        while(T-- > 0){
            int n = Integer.parseInt(next());
            if((n + 1) % 3 == 0 || (n - 1) % 3 == 0){
                System.out.println("First");
            }else{
                System.out.println("Second");
            }
        }
    }
}
