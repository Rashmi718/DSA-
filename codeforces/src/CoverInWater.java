import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CoverInWater {
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
        while (T-- > 0){
            int  n = Integer.parseInt(next());;
            char[] cell = new char[n];

            String s = next();

            for(int i = 0; i < n; i++){
                cell[i] = s.charAt(i);
            }

            int maxEmptyCells = Integer.MIN_VALUE;

            int left = 0;
            int right = 0;
            while(left <= right && right < n){
                if(cell[left] == '.' && cell[right] == '.'){
                    maxEmptyCells = Math.max(maxEmptyCells , right - left + 1);
                    right++;
                }else{
                    left = right + 1;
                    right++;
                }
            }

            if(maxEmptyCells >= 3){
                System.out.println(2);
            }else{
                int count = 0;
                for(char c : cell){
                    if(c == '.'){
                        count++;
                    }
                }

                System.out.println(count);
            }
        }
    }
}
