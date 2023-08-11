class Solution {
    public int change(int B, int[] A) {
        int [] dp = new int[B+1];
        dp[0] = 1;
        int coin;
        for(int j = 0;j<A.length;j++){
            for(int i = A[j];i<=B;i++){
            coin = A[j];
            dp[i]= (dp[i]+dp[i-coin]);
        }
        }
        return dp[B];
    }
}
