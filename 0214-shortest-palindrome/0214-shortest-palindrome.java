class Solution {
    public String shortestPalindrome(String s) {
        if(s==null || s.length()==0)
        return s;

        String rev=new StringBuilder(s).reverse().toString();

        String temp=s+"#"+rev;
        int[] lps=new int[temp.length()];
        int length=0;
        int i=1;

        while(i<temp.length()){
            if(temp.charAt(i)==temp.charAt(length)){
                length++;
                lps[i]=length;
                i++;
            }
            else{
                if(length!=0){
                    length=lps[length-1];
                }
                else{
                    lps[i]=0;
                    i++;
                }
            }
        }
        int longestPlaindrom=lps[temp.length()-1];
        String outChar=rev.substring(0,s.length()-longestPlaindrom);
        return outChar+s;
    }
}