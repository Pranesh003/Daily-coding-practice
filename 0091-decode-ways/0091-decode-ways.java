class Solution {
    public int numDecodings(String s) {
        if(s==null || s.length()==0 || s.charAt(0)=='0')
        return 0;

        int n=s.length();
        int[] nums=new int[n+1];

        nums[0]=1;
        nums[1]=1;

        for(int i=2;i<=n;i++){
            int oneDigit=s.charAt(i-1)-'0';

            if(oneDigit>=1 && oneDigit<=9)
            nums[i]+=nums[i-1];

            int twoDigit=(s.charAt(i-2)-'0')*10+oneDigit;

            if(twoDigit>=10 && twoDigit<=26)
            nums[i]+=nums[i-2];


        }

        return nums[n];
    }
}