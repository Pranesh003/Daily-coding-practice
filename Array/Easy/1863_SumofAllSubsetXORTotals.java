class Solution {
    public int subsetXORSum(int[] nums) {
        int n = nums.length;
        long sum = 0;
       
        for (int b = 0; b < 32; b++) {
            int cnt = 0;
            for (int x : nums) {
                if ((x & (1 << b)) != 0) cnt++;
            }
            if (cnt > 0) {
                
                long contrib = (1L << b) * (1L << (n - 1));
                sum += contrib;
            }
        }
        return (int) sum;
    }
}
