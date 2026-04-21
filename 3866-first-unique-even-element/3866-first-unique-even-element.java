class Solution {
    public int firstUniqueEven(int[] nums) {
        int ans=0;
        int max=0;
        for(int a:nums)max=Math.max(a,max);
        int freq[]=new int[max+1];
        for(int a:nums)freq[a]++;
        for(int a:nums){
            if(a%2==0&&freq[a]==1)return a;
        }
        return -1;
    }
}