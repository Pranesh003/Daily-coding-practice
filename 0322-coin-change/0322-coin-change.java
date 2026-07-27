class Solution {

    public int coinChange(int[] coins, int amount) {

        int n = coins.length;

        int[][] dp = new int[n + 1][amount + 1];

        dp[n][0] = 0;

        for (int amt = 1; amt <= amount; amt++) {
            dp[n][amt] = Integer.MAX_VALUE;
        }

        for (int index = n - 1; index >= 0; index--) {

            dp[index][0] = 0;

            for (int amt = 1; amt <= amount; amt++) {

                int notTake = dp[index + 1][amt];

                int take = Integer.MAX_VALUE;

                if (coins[index] <= amt &&
                        dp[index][amt - coins[index]] != Integer.MAX_VALUE) {

                    take = 1 + dp[index][amt - coins[index]];
                }

                dp[index][amt] = Math.min(take, notTake);
            }
        }

        return dp[0][amount] == Integer.MAX_VALUE ? -1 : dp[0][amount];
    }
}