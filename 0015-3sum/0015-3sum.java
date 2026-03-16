class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>>result=new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n-2;i++){ // fixing one pointer
            if(i>0&&nums[i]==nums[i-1])continue;// for skipping duplicates
            int left=i+1;// other two pointer
            int right=n-1; // other tow pointers
            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];
                if(sum==0){
                    result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                   while(left<right&&nums[left]==nums[left-1])left++;// for skipping duplicates
                   right--;
                   while(left<right&&nums[right]==nums[right+1])right--;// for skipping duplicates
                }
                else if(sum<0){
                    left++;
                    while(left<right&&nums[left]==nums[left-1])left++;
                }else{
                    right--;
                    while(left<right&&nums[right]==nums[right+1])right--;
                }
            }
        }
        return result;
    }
}