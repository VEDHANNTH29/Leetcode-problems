class Solution {
    public int islandPerimeter(int[][] grid) {
        int border=4,perimeter=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
               if(grid[i][j]==1){
                 if(i>0 && grid[i-1][j]==1) border--;
                 if(i+1<grid.length && grid[i+1][j]==1)border--;
                 if(j>0 && grid[i][j-1]==1)border--;
                 if(j+1<grid[0].length && grid[i][j+1]==1)border--;
                 perimeter+=border;
                 border=4;
               }
            }
        }
        return perimeter;
    }
}