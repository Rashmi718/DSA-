package contest.contest514;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class WeightedSum {
    public long weightedSum(int[] parent, int[] nums) {
        int n = parent.length;

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < n; i++)
            adj.add(new ArrayList<>());

        for(int i = 1; i < n; i++)
            adj.get(parent[i]).add(i);

        int[] depth = new int[n];
        int height = 1;

        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        depth[0] = 1;

        while(!q.isEmpty()) {
            int u = q.poll();

            for(int v : adj.get(u)) {
                depth[v] = depth[u] + 1;
                height = Math.max(height, depth[v]);
                q.add(v);
            }
        }

        long sum = 0;

        for(int i = 0; i < n; i++)
            sum += (long) nums[i] * (height - depth[i] + 1);

        return sum;
    }

    public static void main(String[] args) {
        WeightedSum ob = new WeightedSum();
        System.out.println(ob.weightedSum(new int[]{-1,0,1,2} , new int[]{1,2,3,4}));
    }
}
