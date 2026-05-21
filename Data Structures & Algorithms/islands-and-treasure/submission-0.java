class Solution {

    public void islandsAndTreasure(int[][] grid) {

        int rows = grid.length;
        int cols = grid[0].length;

        Queue<int[]> q = new LinkedList<>();

        // put all treasures/gates into queue
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {

                if (grid[r][c] == 0) {
                    q.offer(new int[]{r, c});
                }
            }
        }

        int[][] dir = {
            {1, 0},
            {-1, 0},
            {0, 1},
            {0, -1}
        };

        // BFS
        while (!q.isEmpty()) {

            int[] curr = q.poll();

            int r = curr[0];
            int c = curr[1];

            for (int[] d : dir) {

                int nr = r + d[0];
                int nc = c + d[1];

                // invalid or not empty room
                if (nr < 0 || nc < 0 ||
                    nr >= rows || nc >= cols ||
                    grid[nr][nc] != Integer.MAX_VALUE) {

                    continue;
                }

                // distance update
                grid[nr][nc] = grid[r][c] + 1;

                q.offer(new int[]{nr, nc});
            }
        }
    }
}