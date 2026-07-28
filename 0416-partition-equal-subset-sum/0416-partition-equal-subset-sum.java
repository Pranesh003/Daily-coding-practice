class Solution {
    public boolean canPartition(int[] nums) {
        int totalSum=0;

        for(int x:nums)
        totalSum+=x;

        if(totalSum%2!=0)
        return false;

        int target=totalSum/2;

        int n=nums.length;

        boolean[][] dp=new boolean[n+1][target+1];

        dp[n][0]=true;

        for(int index=n-1;index>=0;index--){
            for(int sum=0;sum<=target;sum++){
                boolean notTake=dp[index+1][sum];
                boolean take=false;
                if(nums[index]<=sum)
                take=dp[index+1][sum-nums[index]];

                dp[index][sum]=take||notTake;
            }
        }
        return dp[0][target];
    }
}