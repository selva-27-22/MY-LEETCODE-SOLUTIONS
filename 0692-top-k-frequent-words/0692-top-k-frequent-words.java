class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer>map=new HashMap<>();
        List<String>list=new ArrayList<>();
        for(String s :words){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        List<Map.Entry<String,Integer>>liist=new ArrayList<>(map.entrySet());
        Collections.sort(liist,(a,b)->{
            if(a.getValue()!=b.getValue()){
                return b.getValue()-a.getValue();
            }
            else{
                return a.getKey().compareTo(b.getKey());
            }
    });
        for(Map.Entry<String,Integer>entry:liist){
           if(k<=0){
            break;
           }
           list.add(entry.getKey());k--;
        }
        return list;
    }
}