class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int n=grid.length;
        // Bottom left
        for(int i=0;i<n;i++){
            List<Integer>current=new ArrayList<>();
            int r=i;
            int c=0;
            while(r<n&&c<n){
                current.add(grid[r][c]);
                r++;
                c++;
            }
            Collections.sort(current,Collections.reverseOrder());
            r=i;
            c=0;
            int index=0;
                while(r<n&&c<n){
                    grid[r][c]=current.get(index++);
                    r++;
                    c++;
                }
            }
            // top right
            for(int i=1;i<n;i++){
            List<Integer>current=new ArrayList<>();
            int r=0;
            int c=i;
            while(r<n&&c<n){
                current.add(grid[r][c]);
                r++;
                c++;
            }
            Collections.sort(current);
            r=0;
            c=i;
            int index=0;
                while(r<n&&c<n){
                    grid[r][c]=current.get(index++);
                    r++;
                    c++;
                }
            }       
         return grid;
    }
}