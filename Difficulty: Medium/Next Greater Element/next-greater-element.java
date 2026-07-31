class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        int n=arr.length;
        ArrayList<Integer>res=new ArrayList<>();
        Stack<Integer>s=new Stack<>();
        
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty()&&s.peek()<=arr[i])
            s.pop();
            
            if(s.isEmpty())
            res.add(-1);
            
            else
            res.add(s.peek());
            
            s.push(arr[i]);
        }
        Collections.reverse(res); 
        return res;
    }
}