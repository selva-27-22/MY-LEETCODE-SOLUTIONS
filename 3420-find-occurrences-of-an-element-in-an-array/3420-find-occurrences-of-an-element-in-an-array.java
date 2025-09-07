class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int occurence=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==x){
                map.put(occurence++,i);
            }
        }
        int k=0;
        for(int a :queries){
            if(!map.containsKey(a)){
                queries[k++]=-1;
            }else{
                queries[k++]=map.get(a);
            }
        }
        return queries; 
}
}