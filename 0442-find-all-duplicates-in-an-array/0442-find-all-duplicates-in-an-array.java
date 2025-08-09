class Solution {
    public List<Integer> findDuplicates(int[] nums) {
      int n=nums.length;
        int freq[]=new int[n+1];
        for(int num:nums){
            freq[num]++;
        }
        List<Integer>result=new ArrayList<>();
        for(int i=0;i<n+1;i++){
            if(freq[i]>1)result.add(i);
        }return result;
    }
}