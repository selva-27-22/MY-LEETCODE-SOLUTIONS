class Solution {
    public int minimumOperations(int[] nums) {
        int max=Integer.MIN_VALUE;
        int count=0;
        for(int a :nums){
            max=Math.max(a,max);
        }
        int freq[]=new int[max+1];
        for(int a:nums){
            if(a==0)continue;
            freq[a]++;
        }
        for(int a : freq){
            if(a>0)count++;
        }
        return count;
    }
}