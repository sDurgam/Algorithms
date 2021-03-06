public class IslandPerimeter {
    public int islandPerimeter(int[][] grid) {
     if(grid == null || grid.length == 0){
         return 0;
     }   
     int p = 0;
     for(int i = 0; i < grid.length; i++)
     {
        for(int j =0; j < grid[i].length; j++)
        {
            if(grid[i][j] == 1)
            {
                p = p + 4;
                if(isValid(i, j-1, grid.length, grid[i].length) && grid[i][j-1] == 1){
                    p--;                      
                }
                if(isValid(i, j+1, grid.length, grid[i].length) && grid[i][j + 1] == 1){
                    p--;
                }
                if(isValid(i-1, j, grid.length, grid[i].length) && grid[i-1][j] == 1){
                    p--;
                }
                if(isValid(i+1, j, grid.length, grid[i].length) && grid[i +1][j] == 1){
                    p--;
                }
            }
        }    
     }
     return p;
    }
    
    boolean isValid(int i, int j, int length, int m){
        if(i >= 0 && j >= 0 && i < length && j < m) return true;
        return false;
    }
}
