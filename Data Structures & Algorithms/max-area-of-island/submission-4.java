class Solution {
    int c;
    public int maxAreaOfIsland(int[][] grid) {
        int count=0;
        
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j< grid[0].length;j++)
            {
                if(grid[i][j]==1)

                {   c=0; 
                    dfs(grid,i,j);
                    count=Math.max(count,c);
                }
            }
        }
        return count;
    }

    private int dfs(int[][] grid, int i, int j)
    {
        if(i<0|| j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]==0)
          {
           return 1;}
        if(grid[i][j]==1){c=c+1;}

        if(grid[i][j] ==2)
           return 0;
        
        grid[i][j]=2;
        int peri =0;
        dfs(grid,i+1,j);
        dfs(grid,i-1,j);
        dfs(grid,i,j+1);
        dfs(grid,i,j-1);
        return peri;

    }
}