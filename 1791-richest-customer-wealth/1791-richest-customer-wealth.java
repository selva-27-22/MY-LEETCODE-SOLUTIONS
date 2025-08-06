class Solution {
    public int maximumWealth(int[][] matrix) {
        int max=0;
        for(int i=0;i<matrix.length;i++){
            int current=0;
            for(int j=0;j<matrix[0].length;j++){
                current+=matrix[i][j];
            }
            max=Math.max(current,max);
        }return max;
    }
}