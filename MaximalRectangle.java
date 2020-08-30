class Solution {
    public int maximalRectangle(char[][] matrix) {
        if (matrix.length == 0) return 0;
        int[][] dp = new int[matrix.length + 1][matrix[0].length + 1];
        int max = 0;
        
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (matrix[i - 1][j - 1] == '1') {
                    //width
                    dp[i][j] = dp[i][j - 1] + 1;
                    
                    int cur = dp[i][j];
                    max = Math.max(max, cur);
                    int width = dp[i][j];
                    for (int k = i - 1; k >= 0; k--) {
                        if (dp[k][j] == 0) {
                            break;
                        } else {
                            int height = i - k + 1;
                            width = Math.min(width, dp[k][j]);
                            cur = height * width;
                            max = Math.max(max, cur);
                        }
                    }
                    
                }
            }
        }
        return max;
    }
}
