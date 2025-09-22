class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int count=0;
        int lesserones=0;
        List<Integer>list=new ArrayList<>();
        for(int a : nums){
            if(a==target)count++;
            else if(a<target)lesserones++;
        }
        for(int i=lesserones;i<lesserones+count;i++){
            list.add(i);
        }
        return list;
    }
}