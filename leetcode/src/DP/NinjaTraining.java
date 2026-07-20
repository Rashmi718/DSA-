package DP;
public class NinjaTraining {
    public int maximumPoints(int[][] mat) {
        return helper(0, -1, mat);
    }

    private int helper(int day, int lastTask, int[][] mat) {

        if (day == mat.length) {
            return 0;
        }

        int max = 0;
        for (int task = 0; task < 3; task++) {
            if (task != lastTask) {
                int points = mat[day][task] + helper(day + 1, task, mat);
                max = Math.max(max, points);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        NinjaTraining ob = new NinjaTraining();
        int[][] mat = {
                {1, 2, 5},
                {3, 1, 1},
                {3, 3, 3}
        };
        System.out.println(ob.maximumPoints(mat));
    }
}