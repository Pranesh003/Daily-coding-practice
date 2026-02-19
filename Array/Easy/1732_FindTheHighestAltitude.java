class Solution {
    public int largestAltitude(int[] gain) {
        int initial=0;
        int ans=0;
        for(int i:gain){
            initial+=i;
            ans=Math.max(ans,initial);
        }
        return ans;
    }
}
