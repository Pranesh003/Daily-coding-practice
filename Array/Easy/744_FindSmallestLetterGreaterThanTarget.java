class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char chr=letters[0];
        for(int i=0; i<letters.length;i++){
            if(letters[i]>target){
                chr=letters[i];
                break;
            }
        }
        return chr;
    }
}
