class Solution {
    public int compress(char[] chars) {
        int writeChar=0;
        int i=0;

        while(i<chars.length){
            char currentChar=chars[i];
            int count=0;

            while(i<chars.length && chars[i]==currentChar){
                i++;
                count++;
            }
            chars[writeChar++]=currentChar;

            if(count>1){
                for(char digit:String.valueOf(count).toCharArray())
                chars[writeChar++]=digit;
            }
        }
        return writeChar;
    }
}