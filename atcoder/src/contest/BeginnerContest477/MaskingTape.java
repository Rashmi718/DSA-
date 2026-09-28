package contest.BeginnerContest477;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class MaskingTape {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int Q = Integer.parseInt(st.nextToken());

        boolean[] tiles = new boolean[N];
        char[] colour = new char[N];

        Arrays.fill(colour, 'a');
        char currentColour = 'a';

        for (int i = 0; i < Q; i++) {

            st = new StringTokenizer(br.readLine());
            int type = Integer.parseInt(st.nextToken());
            if (type == 1) {
                int x = Integer.parseInt(st.nextToken()) - 1;
                if (!tiles[x]) {
                    tiles[x] = true;
                    colour[x] = currentColour;
                } else {
                    tiles[x] = false;
                }

            } else {
                char c = st.nextToken().charAt(0);
                currentColour = c;
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            if (tiles[i]) {
                sb.append(colour[i]);
            } else {
                sb.append(currentColour);
            }
        }

        System.out.println(sb);
    }
}