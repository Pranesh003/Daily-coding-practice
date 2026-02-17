class Solution {
    public int[] runningSum(int[] nums) {
        int n=nums.length;
        int curr[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
           sum+=nums[i];
           curr[i]=sum;
        }
        return curr;
    }
}
