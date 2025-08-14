class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        int max=Integer.MIN_VALUE;
       List<List<Integer>>result=new ArrayList<>();
        for(int a:nums){
            max=Math.max(a,max);
        }
        int freq[]=new int[max+1];
        for(int a:nums){
            freq[a]++;
        }
        boolean balance=true;
        while(balance){
            List<Integer>row=new ArrayList<>();
                balance=false;
                for(int i=1;i<=max;i++){
                    if(freq[i]>0){
                        row.add(i);
                        freq[i]--;
                        if(freq[i]>0)balance=true;
                    }
                }
                if(!row.isEmpty())result.add(row);
                
        }
        return result;
    }
}