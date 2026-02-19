class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth =0;
        for(int[] customer:accounts){
            int wealth=0;
            for(int amount:customer){
                wealth+=amount;
            }
            if(wealth>maxWealth){
                maxWealth=wealth;
            }
        }
        return maxWealth;
    }
}
