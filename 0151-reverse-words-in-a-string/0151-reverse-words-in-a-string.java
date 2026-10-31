class Solution {
    public String reverseWords(String s) {
        int start=0;
        int end=s.length()-1;
        String result="";
        StringBuilder sb=new StringBuilder();
        //REMOVING LEADING SPACES
        while(start<=end&&s.charAt(start)==' '){
            start++;
        }
        //REMOVING TRIALING SPACES
        while(end>=start&&s.charAt(end)==' '){
            end--;
        }
        result=s.substring(start,end+1);
        int n=result.length();
     String words[]=new String[n];
        int index=0;
     for(int i=0;i<result.length();i++){
      char ch=result.charAt(i);
        if(ch!=' '){    
          sb.append(ch);
        }
        else if(sb.length()>0){
            words[index++]=sb.toString();
            sb=new StringBuilder();
        }
     }
      if(sb.length()>0){
            words[index++]=sb.toString();
        }
   String finalanswer=" ";
for(int i=index-1;i>=0;i--){
finalanswer+=words[i]+" ";
}

return finalanswer.trim();

    }
}