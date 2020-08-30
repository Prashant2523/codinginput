class Solution {
    int memo[];
    int solve(int[]coins, int amount, int size){
        if(memo[amount] != -2) return memo[amount];
        if(amount == 0) return memo[amount]= 0;
        int min = Integer.MAX_VALUE-1;
        for(int i=0;i<size;i++){
            int remaining_amount = amount - coins[i];
            if(remaining_amount < 0) continue;
            int temp = solve(coins,remaining_amount,size)+1;
            min = Math.min(temp,min);
        }
        return memo[amount] = min;
    }
    
    public int coinChange(int[] coins, int amount) {
        memo = new int[amount+1];
        Arrays.fill(memo,-2);
        int ans = solve(coins,amount,coins.length);
        return ans== Integer.MAX_VALUE-1 ? -1 : ans;
    }
}
