class Solution {
    public int maxProfit(int[] prices) {
        
        int m=prices.length;
        int max=0;
        for (int i=0;i<m-1;i++){
            for (int j=i+1;j<m;j++){
                if (prices[i]<prices[j] && ((prices[j]-prices[i])>max)){
                     max=prices[j]-prices[i];
                }
            }
        }
        return max;
        
         
    }
}
