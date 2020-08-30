class Solution {
    public int islandPerimeter(int[][] grid) {
        if (grid.length == 0 || grid[0].length == 0) return 0;
        boolean[][] b = new boolean[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1)
                    return dfs(grid, i, j, b);
            }
        }
        return 0;
    }

    private int dfs(int[][] grid, int i, int j, boolean[][] b) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 0) return 1;
        if (b[i][j]) return 0;
        b[i][j] = true;
        return dfs(grid, i + 1, j, b) + dfs(grid, i, j + 1, b) + dfs(grid, i - 1, j, b) + dfs(grid, i, j - 1, b);
    }

}
