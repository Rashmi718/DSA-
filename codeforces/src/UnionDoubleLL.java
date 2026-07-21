import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class UnionDoubleLL {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        int[] prev = new int[n + 1];
        int[] next = new int[n + 1];

        ArrayList<Integer> heads = new ArrayList<>();
        ArrayList<Integer> tails = new ArrayList<>();

        for(int i = 1 ; i <= n ; i++){
            st = new StringTokenizer(br.readLine());
            prev[i] = Integer.parseInt(st.nextToken());
            next[i] = Integer.parseInt(st.nextToken());

            if(prev[i] == 0) heads.add(i);
        }

        for(int head : heads){
            int curr = head;
            while(next[curr] != 0){
                curr = next[curr];
            }

            tails.add(curr);
        }

        for(int i = 0; i < heads.size() - 1 ; i++){
            int currTail = tails.get(i);
            int nextHead = heads.get(i + 1);

            next[currTail] = nextHead;
            prev[nextHead] = currTail;
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 1 ; i <= n ; i++){
            sb.append(prev[i]).append(" ").append(next[i]).append("\n");
        }

        System.out.println(sb);
    }
}