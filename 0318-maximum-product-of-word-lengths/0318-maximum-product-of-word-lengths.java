class Solution {
    public int maxProduct(String[] words) {
        int max=0;
        for(int i=0;i<words.length;i++){
          String str=words[i];
          HashSet<Character>set=new HashSet<>();
          for(char ch:str.toCharArray()){
            set.add(ch);
            if(set.size()==26)break;
          }
          for(int j=i+1;j<words.length;j++){
                int product=str.length()*words[j].length();
                if(product<=max)continue;
                 boolean found=false;
              for(char ch:words[j].toCharArray()){
                if(set.contains(ch)){
                        found=true;
                        break;
                }
              }
              if(!found)max=product;
          }
        }return max;
    }
}