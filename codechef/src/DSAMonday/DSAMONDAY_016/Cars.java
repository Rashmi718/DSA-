package DSAMonday.DSAMONDAY_016;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Cars {
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] cars =  new int[N];
        for (int i = 0; i < N; i++) {
            cars[i] = Integer.parseInt(st.nextToken());
        }

        Stack<Integer> stack = new Stack<>();

        stack.push(cars[0]);
        for(int i = 1 ; i < N ; i++){
            if(stack.peek() > cars[i]){
                stack.push(cars[i]);
            }
        }

        System.out.println(stack.size());
    }
}
