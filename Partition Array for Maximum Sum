class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int n = arr.length;
        int[] dp = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            int maximum = 0;
            int maxSum = 0;
            for (int j = 1; j <= k && i - j >= 0; j++) {
                maximum = Math.max(maximum, arr[i - j]);
                maxSum = Math.max(maxSum, dp[i - j] + maximum * j);
            }
            dp[i] = maxSum;
        }

        return dp[n];
    }
}
