class Solution {
    public int minimumOperations(int[] nums) {
        int operations=0;
        for(int num:nums){
            if((num%3)!=0)operations+=1;  
    }return operations;
}}