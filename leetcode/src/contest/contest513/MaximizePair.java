package contest.contest513;

public class MaximizePair {
    private Long GCD(int x , int y){
        if(x == 0) return (long) y;
        return GCD(y % x , x);
    }

    public long maxPairStrength(int[] nums) {
        int n = nums.length;
        long maxProduct = -1;
        for(int i = 0; i < n ; i++){
            for(int j = i + 1 ; j < n ; j++){
                long p = (long) ((nums[i] * nums[j]) / Math.pow(GCD(nums[i] , nums[j]) , 2));
                maxProduct = Math.max(maxProduct , p);
            }
        }

        return maxProduct;
    }
    public static void main(String[] args) {
        MaximizePair mp = new MaximizePair();
        System.out.println(mp.maxPairStrength(new int[]{2,3,5}));
    }
}
