class Solution {
    public int minOperations(int[][] grid, int x) {
        int m=grid.length;
        int n=grid[0].length;

        int[] num=new int[m*n];
        int index=0;
        int remainder=grid[0][0]%x;

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]%x!=remainder)
                return -1;

                num[index]=grid[i][j];
                index++;
            }
        }

        Arrays.sort(num);

        int median = num[num.length/2];

        int operations=0;

        for(int i=0;i<num.length;i++){
            int diff=Math.abs(num[i]-median);
            operations+=diff/x;

        }
        return operations;
    }
}