import java.util.*;
import java.io.*;

public class Indices {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());

            int[] arr = new int[n];
            for(int i = 0; i < n ; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }

            int ind1 = -1;
            int ind2 = -1;
            int ind3 = -1;

            for(int i = 1; i < n - 1 ; i++){
                if(arr[i] > arr[i - 1] && arr[i] > arr[i + 1]){
                    ind1 = i;
                    ind2 = i + 1;
                    ind3 = i + 2;
                    break;
                }
            }

            if(ind1 == -1 && ind2 == -1 && ind3 == -1){
                System.out.println("NO");
            }else{
                System.out.println("YES");
                System.out.println(ind1 + " "+ ind2 + " " + ind3);
            }
        }
    }
}