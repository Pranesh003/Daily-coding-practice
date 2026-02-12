import java.util.*;

class Solution {
    public int findPairs(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Step 1: Build frequency map
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int count = 0;

        // Step 2: Handle cases
        if(k == 0) {

            // count elements appearing more than once
            for(int val : map.values()) {
                if(val >= 2) {
                    count++;
                }
            }

        } else {

            // count unique pairs
            for(int key : map.keySet()) {
                if(map.containsKey(key + k)) {
                    count++;
                }
            }

        }

        return count;
    }
}
