class Solution {
    public String licenseKeyFormatting(String s, int k) {
        s=s.toUpperCase();
        StringBuilder sb=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            if(ch=='-')continue;
            sb.append(ch);
        }
        String str=sb.toString();
        int i=0;
        StringBuilder sbb=new StringBuilder();
        while(i<str.length()){
            if(i+k>str.length()){
                sbb.append(str.substring(i,str.length()));
                break;
            }else{
                sbb.append(str.substring(i,i+k));
                i+=k;
            }
            if(i!=str.length())sbb.append('-');
        }
        sbb.reverse();
        return sbb.toString();
    }
}