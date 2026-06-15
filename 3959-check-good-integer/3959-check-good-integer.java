class Solution {
    public boolean checkGoodInteger(int n) {
        int[] digits = String.valueOf(n)
        .chars()
        .map(c -> c - '0')
        .toArray();
        int totalSum=0;
        int squareSum=0;
        for(int i=0;i<digits.length;i++){
            totalSum+=digits[i];

            squareSum+=digits[i]*digits[i];

            
        }

        int diff=squareSum-totalSum;
        if(diff>=50){
            return true;
        }

        return false;
    }
}