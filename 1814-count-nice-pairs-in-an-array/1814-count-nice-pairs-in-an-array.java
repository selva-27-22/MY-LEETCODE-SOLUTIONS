class Solution {
    public int countNicePairs(int[] nums) {
        long count=0;
        int n=nums.length;
        int MOD=1000000007;
        HashMap<Long,Long>map=new HashMap<>();
        for(int i=0;i<n;i++){
                long val=nums[i]-(reverse(nums[i]));
                if(map.containsKey(val)){
                    count=(count+map.get(val))%MOD;
                    map.put(val,map.get(val)+1);
                }else{
                    map.put(val,1L);
                }
            }
            return (int)count;
        }
    public static long reverse(int n){
        long rev=0;
         while(n>0){
            int digit=n%10;
            rev*=10;
            rev+=digit;
            n/=10;
        }
    return rev;
    }
}
