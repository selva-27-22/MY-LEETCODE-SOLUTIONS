class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int result[]=new int[nums.length];
        for(int a:nums){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        List<Map.Entry<Integer,Integer>>list=new ArrayList<>(map.entrySet());
        Collections.sort(list,(a,b)->
        {if(a.getValue()==b.getValue()){
            return b.getKey()-a.getKey();
        }else {
            return a.getValue()-b.getValue();
        }
        }
        );
        int j=0;
        for(Map.Entry<Integer,Integer>mapp:list){
            int num=mapp.getKey();
            int freq=mapp.getValue();
            for(int i=0;i<freq;i++){
                result[j++]=num;
            }
        }
        return result;

        
    }
}