class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> set=new HashSet<>();

        for(char c:allowed.toCharArray()) set.add(c);

        int count=0;
        wordLoop:
        for(String word:words){
            for(char c:word.toCharArray()){
                if(!set.contains(c)) continue wordLoop;
            }
            count++;
        }
        return count;
    }
}
