import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class DearemyPaint {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while(T-->0){
            int n =  Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] A = new int[n];
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int i = 0;i<n;i++){
                A[i] = Integer.parseInt(st.nextToken());
                map.put(A[i] , map.getOrDefault(A[i], 0) + 1);
            }

            if(map.size() > 2){
                System.out.println("NO");
            }else if(map.size() == 1){
                System.out.println("YES");
            }else{
                int[] freq = new int [2];
                int i = 0;
                for(int val : map.values()){
                    freq[i++] = val;
                }

                if (Math.abs(freq[0] - freq[1]) <= 1) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
        }
    }
}
