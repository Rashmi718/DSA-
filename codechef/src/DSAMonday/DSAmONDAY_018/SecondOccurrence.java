package DSAMonday.DSAmONDAY_018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class SecondOccurrence {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        int X =  Integer.parseInt(br.readLine());

        HashSet<Integer> set = new HashSet<>();
        boolean flag = false;
        int index = 0;
        for (int i = 0; i < N; i++) {
            if(A[i] == X && !set.contains(A[i])){
                set.add(A[i]);
            }else if (A[i] == X && set.contains(A[i])){
                flag = true;
                index = i;
                break;
            }
        }

        if(flag){
            System.out.println(index);
        }else if(set.contains(X)){
            System.out.println(-2);
        }else{
            System.out.println(-1);
        }
    }
}
