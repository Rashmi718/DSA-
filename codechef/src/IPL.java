import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class IPL {
    private static int maximumFee(int[] matchFee , int index , int count , int n ){
        if(index >= n){
            return 0;
        }

        int fee = 0;
        if (count < 3){
            fee += matchFee[index] + maximumFee(matchFee , index + 1, count +1 , n );
        }else{
            fee +=  maximumFee(matchFee , index + 1, 1 , n );
        }

        return fee;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] matchFee = new int[N];
        for (int i = 0; i < N; i++) {
            matchFee[i] = Integer.parseInt(st.nextToken());
        }

        int max = Integer.MIN_VALUE;
        System.out.println(maximumFee(matchFee , 0 , 1 , N));
    }
}
