package DP;

public class FairArray {

    public int waysToMakeFair(int[] nums) {

        int totalEven = 0;
        int totalOdd = 0;

        // Step 1: Calculate total even and odd sums
        for (int i = 0; i < nums.length; i++) {
            if ((i & 1) == 0)
                totalEven += nums[i];
            else
                totalOdd += nums[i];
        }

        int leftEven = 0;
        int leftOdd = 0;
        int fair = 0;

        // Step 2: Try removing every index
        for (int i = 0; i < nums.length; i++) {

            int rightEven, rightOdd;

            if ((i & 1) == 0) {

                // Remove an even index
                rightEven = totalEven - leftEven - nums[i];
                rightOdd = totalOdd - leftOdd;

            } else {

                // Remove an odd index
                rightEven = totalEven - leftEven;
                rightOdd = totalOdd - leftOdd - nums[i];
            }

            // Right side changes parity after removal
            int newEven = leftEven + rightOdd;
            int newOdd = leftOdd + rightEven;

            if (newEven == newOdd)
                fair++;

            // Update prefix sums
            if ((i & 1) == 0)
                leftEven += nums[i];
            else
                leftOdd += nums[i];
        }

        return fair;
    }

    public static void main(String[] args) {
        FairArray ob = new FairArray();
        System.out.println(ob.waysToMakeFair(new int[]{2, 1, 6, 4}));
    }
}