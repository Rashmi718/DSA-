import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class JaggedSwaps {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while(T-- > 0){
            int N = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] A =  new int[N];

            for(int i=0;i<N;i++){
                A[i] = Integer.parseInt(st.nextToken());
            }

            if(A[0] == 1){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}
