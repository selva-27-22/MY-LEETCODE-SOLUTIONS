class Solution {
    public String largestPalindromic(String num) {
       int freq[]=new int[10];
       StringBuilder result=new StringBuilder();
       //HANDLING EDGE CASE
     boolean allones=true;
       for(char ch:num.toCharArray()){
            int value=ch-'0';
            if(value!=0)allones=false;
            freq[value]++;
       }
       if(allones)return "0";
       String mid="";
       StringBuilder left=new StringBuilder();
       for(int i=9;i>=0;i--){
        if(freq[i]==0)continue;
        if(left.isEmpty()&&i==0)continue;
             if(freq[i]>0){
                int half=freq[i]/2;
                for(int j=0;j<half;j++){
                       left.append(i);
                }
                if(mid.equals("")&&freq[i]%2==1){
                    mid=Integer.toString(i);
                }
             }
       }
       if(left.isEmpty()){
        return mid==""?"0":mid;
       }
       StringBuilder right=new StringBuilder();
       right.append(left.reverse().toString());
       left.reverse();
      return result.append(left.toString()).append(mid).append(right.toString()).toString();
    }
}