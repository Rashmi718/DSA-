package DP;

import java.util.Arrays;
import java.util.List;

public class Triangle {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        return helper(0 , 0, triangle);
    }

    private int helper(int row, int col, List<List<Integer>> triangle) {

        if (row == triangle.size() - 1)
            return triangle.get(row).get(col);

        int down = helper(row + 1, col, triangle);

        int diagonal = helper(row + 1, col + 1, triangle);

        return triangle.get(row).get(col) + Math.min(down, diagonal);
    }

    public static void main(String[] args) {
        Triangle ob = new Triangle();
        List<List<Integer>> list = Arrays.asList(
                Arrays.asList(2),
                Arrays.asList(3, 4),
                Arrays.asList(6, 5, 7),
                Arrays.asList(4, 1, 8, 3)
        );

        System.out.println(ob.minimumTotal(list));
    }
}
