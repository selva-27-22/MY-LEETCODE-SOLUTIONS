class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        List<int []>list=new ArrayList<>();
        for(int i=0;i<score.length;i++){
            list.add(score[i]);
        }
        Collections.sort(list,(a,b)->(b[k]-a[k]));
        for(int i=0;i<score.length;i++){
            score[i]=list.get(i);
        }
        return score;
    }
}