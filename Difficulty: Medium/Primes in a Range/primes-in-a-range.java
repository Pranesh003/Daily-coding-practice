class Solution {
    
    static boolean isPrime(int num){
        if(num<=1)
        return false;
        
        if(num==2)
        return true;
        
        if(num%2==0)
        return false;
        
        for(int i=3;i*i<=num;i+=2){
            if(num%i==0)
            return false;
            
        }
        return true;
    }
    public List<Integer> primeRange(int l, int r) {
        // code here
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=l;i<=r;i++){
            if(isPrime(i))
            list.add(i);
        }
        return list;
    }
}