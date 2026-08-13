class Solution {
    static int matrixMultiplication(int arr[]) {
        // code here
        int n=arr.length;
        int[][] dp=new int[n][n];
        
        for(int[] row:dp)
        Arrays.fill(row,-1);
        
        return solve(1,n-1,arr,dp);
    }
    
    public static int solve(int i,int j,int[] arr,int[][] dp){
        if(i==j)
        return 0;
        
        if(dp[i][j]!=-1)
        return dp[i][j];
        
        int ans=Integer.MAX_VALUE;
        
        for(int k=i;k<j;k++){
            int cost=solve(i,k,arr,dp)+solve(k+1,j,arr,dp)+arr[i-1]*arr[k]*arr[j];
            ans=Math.min(ans,cost);
        }
        return dp[i][j]=ans;
    }
}