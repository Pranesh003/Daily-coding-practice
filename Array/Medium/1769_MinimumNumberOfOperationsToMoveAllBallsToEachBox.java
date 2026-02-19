class Solution {
    public int[] minOperations(String boxes) {

        int[] res= new int[boxes.length()];

        int left=0, right=0, left_count=0, right_count=0;

        for(int i=0;i<boxes.length(); i++){
            if(boxes.charAt(i)=='1'){
                right+=(i+1);
                right_count++;

            }
        }
        for(int i=0;i<boxes.length();i++){
            if(boxes.charAt(i)=='1'){
                right_count-=1;
                right=right-right_count-1;
                res[i]=left+right;
                left_count+=1;
                
            }else{
                right-=right_count;
                res[i]=left+right;

            }
            left+=left_count;
        }
        return res;
        
    }
}
