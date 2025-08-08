class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashSet<String>seen=new HashSet<>();
        HashSet<String>duplicates=new HashSet<>();
        for (String s:arr){
            if(seen.contains(s)){
                duplicates.add(s);
            }else seen.add(s);
        }
        
        for(String s:arr){
            if(!(duplicates.contains(s)))k--;
            if(k==0)return s;
        }return "";
      
    }
}