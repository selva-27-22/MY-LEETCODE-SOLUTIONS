class Solution {
    //guards=1;
    //walls=2;
    //filling=3;
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int arr[][]=new int[m][n];
        int covered=0;
        for(int i=0;i<guards.length;i++){
            int row=guards[i][0];
            int col=guards[i][1];
            arr[row][col]=1;
        }
        for(int i=0;i<walls.length;i++){
            int row=walls[i][0];
            int col=walls[i][1];
            arr[row][col]=2;
        }
        for(int a []:guards){
            int row=a[0];
            int col=a[1];
            //right
            for(int j=col+1;j<n;j++){
                if(arr[row][j]==1||arr[row][j]==2)break;
                arr[row][j]=3;
            }
            //left
            for(int j=col-1;j>=0;j--){
                if(arr[row][j]==1||arr[row][j]==2)break;
                arr[row][j]=3;
            }
            //up
            for(int j=row-1;j>=0;j--){
                if(arr[j][col]==1||arr[j][col]==2)break;
                arr[j][col]=3;
            }
            //down
             for(int j=row+1;j<m;j++){
                if(arr[j][col]==1||arr[j][col]==2)break;
                arr[j][col]=3;
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==0)covered++;
            }
        }
        return covered;
    }
}