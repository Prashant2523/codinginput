class Solution {
    public int numSquares(int n) {
        int dp[] = new int[n+1];
        
        Arrays.fill(dp, Integer.MAX_VALUE);
        int root = (int)Math.sqrt(n);
        dp[0] = 0;
        for(int i=1;i<=root;i++)
        {
            for(int j=1;j<=n;j++)
            {
                int sqr = (int)Math.pow(i, 2);
                if(sqr <= j)
                {
                    dp[j] = Math.min(dp[j], dp[j-sqr]+1);
                }
            }
        }
        return dp[n];
    }
}
