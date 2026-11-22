class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer>stack=new Stack<>();

        for(int ast:asteroids){
            boolean destroyed= false;

            while(!stack.isEmpty() && stack.peek()>0 && ast<0){
                int topSize=stack.peek();
                int astSize=Math.abs(ast);

                if(topSize<astSize)
                stack.pop();

                else if(topSize==astSize){
                    stack.pop();
                    destroyed=true;
                    break;
                }
                else{
                    destroyed=true;
                    break;
                }
            }
            if(!destroyed)
            stack.push(ast);
        }

        int[] result=new int[stack.size()];
        for(int i=result.length-1;i>=0;i--)
        result[i]=stack.pop();

        return result;
    }
}