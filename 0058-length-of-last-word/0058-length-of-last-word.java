class Solution {
    public int lengthOfLastWord(String s) {
        String[] word=s.split(" ");

        String len=word[word.length-1];

        return len.length();
    }
}