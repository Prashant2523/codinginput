class NumIsland{
public static int numIslands(char[][] grid) {
        int islands = 0;
        for (int col = 0; col < grid.length; col++) {
            for (int raw = 0; raw < grid[0].length; raw++) {
                if (grid[col][raw] == '1') {
                    islands++;
                    numIslandsRecursive(grid, col, raw);
                }
            }
        }

        return islands;
    }

    private static void numIslandsRecursive(char[][] grid, int col, int raw) {
        if (col < 0 || raw < 0 || col >= grid.length || raw >= grid[0].length || grid[col][raw] == '0') {
            return;
        }

        grid[col][raw] = '0';
        numIslandsRecursive(grid, col, raw + 1);
        numIslandsRecursive(grid, col + 1, raw);
        numIslandsRecursive(grid, col, raw - 1);
        numIslandsRecursive(grid, col - 1, raw);
    }
    }
