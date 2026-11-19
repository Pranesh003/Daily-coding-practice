class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int ogColor=image[sr][sc];

        if(ogColor==color)
        return image;

        dfs(image, sr, sc, ogColor, color);
        return image;
    }

    private void dfs(int[][] image, int row, int col, int ogColor, int color){
        if(row<0 || col<0 || row>=image.length || col>=image[0].length)
        return;

        if(image[row][col]!=ogColor)
        return;

        image[row][col]=color;

        dfs(image,row+1,col,ogColor,color);
        dfs(image,row-1,col,ogColor,color);
        dfs(image,row,col+1,ogColor,color);
        dfs(image,row,col-1,ogColor,color);
    }
}