
package Graph;

import java.util.*;

public class PassSecret {

    public static void dfs(int node,
                           ArrayList<ArrayList<Integer>> adj,
                           HashSet<Integer> visited,
                           List<Integer> res) {

        if (visited.contains(node)) return;

        visited.add(node);
        res.add(node);

        for (int v : adj.get(node)) {
            if (!visited.contains(v)) {
                dfs(v, adj, visited, res);
            }
        }
    }

    public static List<Integer> findAllPeople(int n, int[][] meetings, int firstPerson) {

        Arrays.sort(meetings, (a, b) -> Integer.compare(a[2], b[2]));

        HashSet<Integer> knows = new HashSet<>();
        knows.add(0);
        knows.add(firstPerson);

        int i = 0;

        while (i < meetings.length) {

            int t = meetings[i][2];

            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                adj.add(new ArrayList<>());
            }

            int j = i;

            while (j < meetings.length && meetings[j][2] == t) {
                int u = meetings[j][0];
                int v = meetings[j][1];

                adj.get(u).add(v);
                adj.get(v).add(u);

                j++;
            }

            HashSet<Integer> visited = new HashSet<>();
            ArrayList<Integer> res = new ArrayList<>();

            for (int k = i; k < j; k++) {
                int u = meetings[k][0];
                int v = meetings[k][1];

                if (knows.contains(u)) {
                    dfs(u, adj, visited, res);
                }

                if (knows.contains(v)) {
                    dfs(v, adj, visited, res);
                }
            }

            knows.addAll(res);
            i = j;
        }

        return new ArrayList<>(knows);
    }

    public static void main(String[] args) {

        int[][] meetings = {
                {3, 1, 3},
                {1, 2, 2},
                {0, 3, 3}
        };


        List<Integer> res = findAllPeople(4, meetings, 3);

        for (int v : res) {
            System.out.println(v);
        }
    }
}
