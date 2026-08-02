class Solution {
    public int numIslands(char[][] grid) {
        Queue<int[]> bfs = new LinkedList<>();
        int islandCount = 0;

        for(int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                char value = grid[i][j];
                if (value == '1') {
                    islandCount++;
                    bfs.add(new int[]{i, j});
                    while (!bfs.isEmpty()) {
                        int[] coordinates = bfs.poll(); // Queue uses poll() instead of pop()
                        int x = coordinates[0];
                        int y = coordinates[1];
                        grid[x][y] = 0;
                        // Check Up
                        if (x > 0 && grid[x - 1][y] == '1') {
                            bfs.add(new int[]{x - 1, y});
                            grid[x - 1][y] = '0';
                        }
                        // Check Down
                        if (x < grid.length - 1 && grid[x + 1][y] == '1') {
                            bfs.add(new int[]{x + 1, y});
                            grid[x + 1][y] = '0';
                        }
                        // Check Left
                        if (y > 0 && grid[x][y - 1] == '1') {
                            bfs.add(new int[]{x, y - 1});
                            grid[x][y - 1] = '0';
                        }
                        // Check Right
                        if (y < grid[0].length - 1 && grid[x][y + 1] == '1') {
                            bfs.add(new int[]{x, y + 1});
                            grid[x][y + 1] = '0';
                        }
                    }
                }
            }
        }
        return islandCount;
    }
}
