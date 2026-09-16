package StartersContest.STARTERS256;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class SwappingVar_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = null;

        String inputLine = reader.readLine();
        if (inputLine == null) return;
        int t = Integer.parseInt(inputLine.trim());

        StringBuilder outputBuffer = new StringBuilder();

        while (t-- > 0) {
            inputLine = reader.readLine();
            while (inputLine != null && inputLine.trim().isEmpty()) {
                inputLine = reader.readLine();
            }
            if (inputLine == null) break;

            int n = Integer.parseInt(inputLine.trim());
            int[] perm = new int[n + 1];
            int[] pos = new int[n + 1];

            tokenizer = new StringTokenizer(reader.readLine());
            for (int i = 1; i <= n; i++) {
                perm[i] = Integer.parseInt(tokenizer.nextToken());
                pos[perm[i]] = i;
            }

            ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
            for (int i = 0; i <= n; i++) {
                graph.add(new ArrayList<>());
            }

            int[] inDegree = new int[n + 1];

            for (int v = 1; v < n; v++) {
                int u = v + 1;
                if (pos[v] < pos[u]) {
                    graph.get(v).add(u);
                    inDegree[u]++;
                } else {
                    graph.get(u).add(v);
                    inDegree[v]++;
                }
            }

            PriorityQueue<Integer> pq = new PriorityQueue<>();
            for (int i = 1; i <= n; i++) {
                if (inDegree[i] == 0) {
                    pq.add(i);
                }
            }

            int count = 0;
            while (!pq.isEmpty()) {
                int current = pq.poll();
                outputBuffer.append(current);
                count++;
                if (count < n) {
                    outputBuffer.append(" ");
                } else {
                    outputBuffer.append("\n");
                }

                for (int nextNode : graph.get(current)) {
                    inDegree[nextNode]--;
                    if (inDegree[nextNode] == 0) {
                        pq.add(nextNode);
                    }
                }
            }
        }

        System.out.print(outputBuffer);
    }
}
