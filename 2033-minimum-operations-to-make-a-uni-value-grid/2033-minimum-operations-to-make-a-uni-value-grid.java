class Solution {
    public int minOperations(int[][] grid, int x) {
        int m=grid.length;
        int n=grid[0].length;

        int[] nums =new int[m*n];
        int remainder=grid[0][0]%x;
        int index=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]%x != remainder){
                    return -1;
                }
                nums[index++]=grid[i][j];
            }
        }

        Arrays.sort(nums);
        int median = nums[nums.length/2];
        int operation=0;
        for(int num:nums){
            operation+=Math.abs(num-median)/x;
        }
        return operation;

    }
}