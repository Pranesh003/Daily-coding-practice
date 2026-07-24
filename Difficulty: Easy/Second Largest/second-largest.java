class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int n= arr.length;
        int Largest=-1;
        int secondLargest=-1;
        
        for(int i=0;i<n;i++){
            if(arr[i]>Largest)
            Largest=arr[i];
        }
        
        for(int i=0;i<n;i++){
            if(arr[i]>secondLargest && arr[i]!=Largest){
                secondLargest = arr[i];
            }
            
        }
        return secondLargest;
    }
}