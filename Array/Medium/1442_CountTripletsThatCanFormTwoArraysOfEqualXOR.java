class Solution {
    public int countTriplets(int[] arr) {
        int n=arr.length;

        int[] prefix=new int[n+1];
        for(int t=0;t<n;t++){
            prefix[t+1]=prefix[t]^arr[t];
        }

        int count=0;
        for(int i=0;i<n;i++){
            for(int k=i+1;k<n;k++){
                if(prefix[i]==prefix[k+1])
                count+=(k-i);
            }
        }
        return count;
    }
}
