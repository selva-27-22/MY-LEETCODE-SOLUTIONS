class Solution {
    public int maximumValue(String[] strs) {
        int max=0;
        for(String s: strs){
            boolean letter=false;
            String a=s;
            for(char ch:s.toCharArray()){
                if(ch>='a'&&ch<='z'){
                    letter=true;
                    max=Math.max(max,s.length());
                    break;
                }
            }
            if(!letter){
                int n=Integer.parseInt(a);
                max=Math.max(n,max);
            }
        }
        return max;
    }
}