class Solution {
    public int firstUniqChar(String s) {
        int[] count = new int[26];

        // First pass: count how many times each letter appears
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }

        // Second pass: find the first index with a frequency of 1
        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }
}
