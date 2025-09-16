class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
      String words[]=text.split(" ");
      int count=0;
      for(String str:words){
        boolean broken=false;
        for(char ch:brokenLetters.toCharArray()){
            if(str.indexOf(ch)!=-1){
                broken=true;
                break;
            }
        }
        if(!broken)count++;
      }
      return count;
    }
}