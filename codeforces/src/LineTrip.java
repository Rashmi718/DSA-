import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LineTrip {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static String next() throws Exception {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine());
        }
        return st.nextToken();
    }


    public static void main(String[] args) throws Exception {

        int T = Integer.parseInt(next());
        while(T-- > 0){
            int n = Integer.parseInt(next());
            int x = Integer.parseInt(next());

            int[] A = new int[n + 1];
            for(int i = 0; i < n ; i++){
                A[i] = Integer.parseInt(next());
            }

            A[n] = x;

                int fuel = A[0] - 0;
                for(int i = 1 ; i <= n ; i++){
                    if(A[i] != x){
                        fuel = Math.max(fuel , A[i] - A[i - 1]);
                    }else{
                        fuel = Math.max(fuel , 2 * (A[i] - A[i - 1]));
                    }
                }

                System.out.println(fuel);

        }
    }
}
