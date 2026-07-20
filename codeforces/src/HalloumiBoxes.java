import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class HalloumiBoxes {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static String next() throws Exception {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine());
        }
        return st.nextToken();
    }


    public static boolean isSorted(int[] array) {
        return IntStream.range(0, array.length - 1).noneMatch(i -> array[i] > array[i + 1]);
    }


    public static void main(String[] args) throws Exception {

        int T = Integer.parseInt(next());
        while(T-- > 0){
            int n = Integer.parseInt(next());
            int k = Integer.parseInt(next());

            int[] A = new int[n];
            for(int i = 0; i < n ; i++){
                A[i] = Integer.parseInt(next());
            }

            if(isSorted(A)){
                System.out.println("YES");
                continue;
            }

            if(k > 1){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
