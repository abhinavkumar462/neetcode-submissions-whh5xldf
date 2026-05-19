class Solution {
    public int numIslands(char[][] grid) {
        int count=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j< grid[0].length;j++)
            {
                if(grid[i][j]=='1')
                { count+=1;
                    dfs(grid,i,j);
                }
            }
        }
        return count;
    }

    private int dfs(char[][] grid, int i, int j)
    {
        if(i<0|| j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]=='0')
           return 1;

        if(grid[i][j] =='2')
           return 0;
        
        grid[i][j]='2';
        int peri =0;
        peri += dfs(grid,i+1,j);
        peri += dfs(grid,i-1,j);
        peri += dfs(grid,i,j+1);
        peri += dfs(grid,i,j-1);
        return peri;

    }
}