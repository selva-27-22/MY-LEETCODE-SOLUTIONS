class Solution {
    public int findTheWinner(int n, int k) {
        List<Integer>list=new ArrayList<>();
        int deleteindex=0;
       for(int i=1;i<=n;i++){
        list.add(i);
       }
       while(list.size()>1){
        deleteindex=(deleteindex+k-1)%list.size();
        list.remove(deleteindex);
       }
       return list.get(0);
    }
}