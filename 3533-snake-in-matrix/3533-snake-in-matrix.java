class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int i=0;
        int j=0;
        for(String s:commands){
            switch(s.charAt(0)){
                case 'R':j++;break;
                case 'L':j--;break;
                case 'U':i--;break;
                default : i++; break;
            }
        }return i * n + j;
    }
}