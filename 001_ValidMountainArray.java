class Solution {
    public boolean validMountainArray(int[] arr) {
        int n=arr.length;

        int state=0;
        for(int i=0; i<n-1;i++){
            if(state==0){
                if(arr[i]<arr[i+1]){}
                else if(i>0 && arr[i]>arr[i+1]){
                    state=1;
…            }

        }
        return state==1;
    }
}
