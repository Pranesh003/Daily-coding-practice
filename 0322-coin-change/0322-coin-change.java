class Solution {

    int[][] dp;

    public int solve(int index, int[] coins, int amount) {

        if (amount == 0)
            return 0;

        if (index == coins.length)
            return Integer.MAX_VALUE;

        if (dp[index][amount] != -1)
            return dp[index][amount];

        int notTake = solve(index + 1, coins, amount);

        int take = Integer.MAX_VALUE;

        if (coins[index] <= amount) {
            int ans = solve(index, coins, amount - coins[index]);

            if (ans != Integer.MAX_VALUE)
                take = 1 + ans;
        }

        return dp[index][amount] = Math.min(take, notTake);
    }

    public int coinChange(int[] coins, int amount) {

        dp = new int[coins.length][amount + 1];

        for (int i = 0; i < coins.length; i++) {
            Arrays.fill(dp[i], -1);
        }

        int ans = solve(0, coins, amount);

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}