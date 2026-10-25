class Solution {
    public int closedIsland(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int closed_islands=0;
        //top row
        for(int j=0;j<n;j++){
            if(grid[0][j]==0){
                mark_unclosed(grid,0,j,m,n);
            }
        }
        //bottom row
        for(int j=0;j<n;j++){
            if(grid[m-1][j]==0){
                mark_unclosed(grid,m-1,j,m,n);
            }
        }
        //first column
        for(int i=0;i<m;i++){
            if(grid[i][0]==0){
                mark_unclosed(grid,i,0,m,n);
            }
        }
        //last column
        for(int i=0;i<m;i++){
            if(grid[i][n-1]==0){
                mark_unclosed(grid,i,n-1,m,n);
            }
        }
        // // just to check whether the marking open islands has done or not
        // for(int i=0;i<m;i++){
        //     for(int j=0;j<n;j++){
        //         System.out.print(grid[i][j]);
        //     }
        //     System.out.println();
        // }

        // // Optimized because of single loop instead of four loops🥴
        // for(int i=0;i<m;i++){
        //     for(int j=0;j<n;j++){
        //         if((i==0||j==0||i==m-1||j==n-1)&&grid[i][j]==0){
        //             mark_unclosed(grid,i,j,m,n);
        //         }
        //     }
        // }
        //Phase 2
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==0){
                    closed_islands++;
                    check(grid,i,j,m,n);
                }
            }
        }
        return closed_islands;
    }
    private static void mark_unclosed(int grid[][],int i, int j ,int m, int n ){
        if(i<0||i>=m||j<0||j>=n)return;
        if(grid[i][j]==1)return;
        grid[i][j]=1;
        
        //left
        mark_unclosed(grid,i,j-1,m,n);
        //right
        mark_unclosed(grid,i,j+1,m,n);
        //up
        mark_unclosed(grid,i-1,j,m,n);
        //down
        mark_unclosed(grid,i+1,j,m,n);
    }
    private static void check(int grid[][],int i,int j,int m,int n){
        if(i<0||i>=m||j<0||j>=n)return;
        if(grid[i][j]==1)return;
        grid[i][j]=1;
        check(grid,i-1,j,m,n);
        check(grid,i+1,j,m,n);
        check(grid,i,j-1,m,n);
        check(grid,i,j+1,m,n);
    }
}