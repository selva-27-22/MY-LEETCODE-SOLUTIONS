class Solution {
    public int triangularSum(int[] nums) {
        // List<Integer>list=new ArrayList<>();
        // for(int a:nums){
        //     list.add(a);
        // }
        // while(list.size()!=1){
        //     List<Integer>temp=new ArrayList<>();
        //     for(int i=0;i<list.size()-1;i++){
        //         int value=(list.get(i)+list.get(i+1))%10;
        //         temp.add(value);
        //     }
        //     list=temp;
        // }
        // return list.get(0);
      int n=nums.length;
      for(int i=0;i<n-1;i++){
        for(int j=0;j<n-i-1;j++){
            nums[j]=(nums[j]+nums[j+1])%10;
        }
      }
      return nums[0];
    }
}