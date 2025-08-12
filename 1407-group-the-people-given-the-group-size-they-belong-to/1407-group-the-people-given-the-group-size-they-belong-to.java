class Solution {
    public List<List<Integer>> groupThePeople(int[] nums) {
        HashMap<Integer,List<Integer>>map=new HashMap<>();
        List<List<Integer>>result=new ArrayList<>();
       for(int i=0;i<nums.length;i++){
        int size=nums[i];
        if(!map.containsKey(size)){
            map.put(size,new ArrayList<>());
        }
        map.get(size).add(i);
        if(map.get(size).size()==size){
        result.add(new ArrayList<>(map.get(size)));
        map.get(size).clear();
        }
       }
       return result;

    }
}