class Solution {
    private int height, width;
    private final int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    public int maxAreaOfIsland(int[][] grid) {
         if (grid == null || grid.length == 0) {
            return 0;
        }
        height = grid.length;
        width = grid[0].length;
        int max = 0;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if(grid[i][j] == 1) {
                    
                    max = Math.max(max, dfs(grid, i, j));
                    
                }
            }
        }
        return max;
    }
    private int dfs(int[][] grid, int x, int y) {
        if (x < 0 || x > height - 1 || y < 0 || y > width - 1 || grid[x][y] == 0) {
            return 0;
        }
        grid[x][y] = 0;
        int res = 1;
        for (int i = 0; i < 4; i++) {
            int newX = x + directions[i][0];
            int newY = y + directions[i][1];
            res = res + dfs(grid, newX, newY);
        }
        return res;
    }
}
