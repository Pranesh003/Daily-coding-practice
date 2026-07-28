class Solution {

    public boolean canPartition(int[] nums) {

        int totalSum = 0;

        for (int num : nums)
            totalSum += num;

        if (totalSum % 2 != 0)
            return false;

        int target = totalSum / 2;
        int n = nums.length;

        boolean[] next = new boolean[target + 1];
        next[0] = true;

        for (int index = n - 1; index >= 0; index--) {

            boolean[] curr = new boolean[target + 1];
            curr[0] = true;

            for (int sum = 1; sum <= target; sum++) {

                boolean notTake = next[sum];

                boolean take = false;

                if (nums[index] <= sum)
                    take = next[sum - nums[index]];

                curr[sum] = take || notTake;
            }

            next = curr;
        }

        return next[target];
    }
}