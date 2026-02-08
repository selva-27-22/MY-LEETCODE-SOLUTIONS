class Solution {
    public List<Integer> findLonely(int[] nums) {
        List<Integer>result=new ArrayList<>();
        int max=0;
        if(nums.length==1){
            result.add(nums[0]);
            return result;
        }
        for(int a :nums){
            max=Math.max(a,max);
        }
        int freq[]=new int[max+1];
        for(int a :nums){
            freq[a]++;
        }
        if(freq[0]==1&&freq[1]==0)result.add(0);
        if((freq[max]==1)&&freq[max-1]==0)result.add(max);
        for(int i=1;i<max;i++){
          if(freq[i]==1&&freq[i-1]==0&&freq[i+1]==0)result.add(i);
        }
        return result;
    }
}