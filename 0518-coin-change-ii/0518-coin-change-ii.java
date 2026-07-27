class Solution {

    public int change(int amount, int[] coins) {

        int n = coins.length;

        int[][] dp = new int[n + 1][amount + 1];

        // Base case
        dp[n][0] = 1;

        for (int index = n - 1; index >= 0; index--) {

            for (int amt = 0; amt <= amount; amt++) {

                int notTake = dp[index + 1][amt];

                int take = 0;

                if (coins[index] <= amt)
                    take = dp[index][amt - coins[index]];

                dp[index][amt] = take + notTake;
            }
        }

        return dp[0][amount];
    }
}