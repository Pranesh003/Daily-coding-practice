class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int[] x=new int[points.length];

        for(int i=0;i<points.length;i++){
            x[i]=points[i][0];
        }

        Arrays.sort(x);
        int maxGap=0;

        for(int i=1;i<points.length;i++){
            int gap=x[i]-x[i-1];
            maxGap=Math.max(maxGap,gap);
        }
        return maxGap;
    }
}
