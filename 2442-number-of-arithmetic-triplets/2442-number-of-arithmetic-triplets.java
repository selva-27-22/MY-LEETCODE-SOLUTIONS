class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int triplets=0;
        int n=nums.length;
        // for(int i=0;i<n-2;i++){
        //     for(int j=i+1;j<n-1;j++){
        //         for(int k=j+1;k<n;k++){
        //             if((nums[j]-nums[i]==diff)&&(nums[k]-nums[j]==diff))triplets++;
        //         }
        //     }
        // }
        // return triplets;
        HashSet<Integer>set=new HashSet<>();
        for(int num:nums){
            if(set.contains(num-diff)&&set.contains(num-(2*diff)))triplets++;
            set.add(num);
        }return triplets;
    }
}