class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int count=0;
        for(int i=0;i<nums.size()-1;i++){
            int ii=nums.get(i);
            for(int j=i+1;j<nums.size();j++){
                if((nums.get(j)+ii)<target){
                    count++;
                }
            }
        }return count;
    }
}