class Solution {
    public int countPartitions(int[] nums) {
        // int count=0;
        int n=nums.length;
        int total=0;
        for(int a :nums)total+=a;
        return (total%2==0)?n-1:0;
    }
}