class Solution {
    public ArrayList<Integer> prefSum(int[] arr) {
        // code here
        int n=arr.length;
        ArrayList<Integer> list=new ArrayList<>();
        
        list.add(arr[0]);
        
        for(int i=1;i<n;i++){
            list.add(list.get(i-1)+arr[i]);
        }
        return list;
    }
}