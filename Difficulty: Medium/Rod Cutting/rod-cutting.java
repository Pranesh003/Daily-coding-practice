class Solution {
    int[][] dp;
    public int cutRod(int[] price) {
        // code here
        int n=price.length;
        dp=new int[n][n+1];
        
        for(int i=0;i<dp.length;i++)
        Arrays.fill(dp[i],-1);
        
        return solve(0,n,price);
        
    }
    
    private int solve(int index,int rem,int[] price){
        if(index==price.length||rem==0)
        return 0;
        
        if(dp[index][rem]!=-1)
        return dp[index][rem];
        
        int notTake=solve(index+1,rem,price);
        int take=0;
        int current=index+1;
        if(current<=rem)
        take=price[index]+solve(index,rem-current,price);
        
        return dp[index][rem]=Math.max(take,notTake);
    }
}