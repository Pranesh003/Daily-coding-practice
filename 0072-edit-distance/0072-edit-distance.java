class Solution {
    public int minDistance(String word1, String word2) {
        int m=word1.length();
        int n=word2.length();

        int[][] grid =new int[m+1][n+1];

        for(int i=0;i<=m;i++)
        grid[i][0]=i;

        for(int j=0;j<=n;j++)
        grid[0][j]=j;

        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(word1.charAt(i-1)==word2.charAt(j-1))
                grid[i][j]=grid[i-1][j-1];

                else{
                    int replace=grid[i-1][j-1];
                    int delete=grid[i-1][j];
                    int insert=grid[i][j-1];

                    grid[i][j]=1+Math.min(replace,Math.min(delete, insert));
                }
            }
        }
        return grid[m][n];
    }
}