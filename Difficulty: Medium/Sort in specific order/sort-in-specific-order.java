class Solution {
    public void sortIt(int[] arr) {
        // code here
        ArrayList<Integer>odd=new ArrayList<>();
        ArrayList<Integer>even=new ArrayList<>();
        
        for(int num:arr){
            if(num%2==0)
            even.add(num);
            else 
            odd.add(num);
        }
        
        Collections.sort(even);
        Collections.sort(odd,Collections.reverseOrder());
        
        int idx=0;
        
        for(int i=0;i<odd.size();i++)
        arr[idx++]=odd.get(i);
        for(int i=0;i<even.size();i++)
        arr[idx++]=even.get(i);
        
    }
}
