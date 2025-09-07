class Solution {
    public int hIndex(int[] citiations) {
       int max=Integer.MIN_VALUE;
       for(int a :citiations){
        max=Math.max(a,max);
       }
       int count=0;
       int freq[]=new int[max+1];
       for(int a :citiations){
        freq[a]++;
       }
       int index=0;
       for(int i=0;i<=max;i++){
        while(freq[i]>0){
            citiations[index++]=i;
            freq[i]--;
        }
       }
        int paper=1;
        for(int i=citiations.length-1;i>=0;i--){
                int cit=citiations[i];
                if(cit<paper)break;
                paper++;
        }
       return paper-1;
    }
}