class Solution {
    
    static boolean isPrime(int num){
        if(num<2)
        return false;
        
        for(int i=2;i*i<=num;i++){
            if(num%i==0)
            return false;
        }
        return true;
    }
    
    static int revNumber(int num){
        int rev=0;
        while(num>0){
        rev=rev*10+(num%10);
        num/=10;
        }
        return rev;
    }
    
    public boolean isTwistedPrime(int n) {
        // code here
        if(!isPrime(n))
        return false;
        
        int rev=revNumber(n);
        
        return isPrime(rev);
    }
}