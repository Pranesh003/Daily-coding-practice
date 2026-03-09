class Solution {
    public int countBinarySubstrings(String s) {
        int cur=1;
        int pre=0;
        int ans=0;

        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                cur++;
            }
            else{
                ans+=Math.min(pre,cur);
                pre=cur;
                cur=1;
            }
        }
        ans+=Math.min(pre,cur);
        return ans;
    }
}
