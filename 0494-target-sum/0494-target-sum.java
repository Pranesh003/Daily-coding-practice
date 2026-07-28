class Solution {

    public int solve(int index, int[] nums, int sum) {

     if (index == nums.length) {
    if (sum == 0)
        return 1;
    return 0;
}

        int notTake = solve(index + 1, nums, sum);

        int take = 0;

        if (nums[index] <= sum)
            take = solve(index + 1, nums, sum - nums[index]);

        return take + notTake;
    }

    public int findTargetSumWays(int[] nums, int target) {

        int totalSum = 0;

        for (int x : nums)
            totalSum += x;

        if (Math.abs(target) > totalSum)
            return 0;

        if ((target + totalSum) % 2 != 0)
            return 0;

        int requiredSum = (target + totalSum) / 2;

        return solve(0, nums, requiredSum);
    }
}