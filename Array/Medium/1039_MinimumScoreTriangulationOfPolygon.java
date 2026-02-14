class Solution {
    public int minScoreTriangulation(int[] values) {
        int n=values.length;

        int[][] dp=new int[n][n];

        for(int i=0;i<n;i++){
            dp[i][i]=0;
            if(i+1<n)dp[i][i+1]=0;
        }

        for(int length=3;length<=n;length++){
            for(int i=0;i+length-1<n;i++){
                int j=i+length-1;
                int best=Integer.MAX_VALUE;
                for(int k=i+1;k<=j-1;k++){
                    int cost=dp[i][k]+dp[k][j]+values[i]*values[j]*values[k];
                    if(cost<best)best=cost;
                }
                dp[i][j]=(best==Integer.MAX_VALUE)?0:best;
            }
        }
        return dp[0][n-1];
    }
}
