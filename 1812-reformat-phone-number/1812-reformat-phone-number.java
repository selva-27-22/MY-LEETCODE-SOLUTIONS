class Solution {
    public String reformatNumber(String number) {
        StringBuilder sb=new StringBuilder();
        for(char ch:number.toCharArray()){
            if(ch==' '||ch=='-')continue;
            sb.append(ch);
        }
        String str=sb.toString();
        int i=0;
        int len=str.length();
        StringBuilder result=new StringBuilder();

        while(i<str.length()){
            if(len-i>4){
                result.append(str.substring(i,i+3));
                i+=3;
                if(i!=str.length())result.append("-");
        }
        else if(len-i==4){
            result.append(str.substring(i,i+2)).append("-");
            result.append(str.substring(i+2,i+4));
            i+=4;
             if(i!=str.length())result.append("-");
        }
        else if(len-i==3||len-i==2){
            result.append(str.substring(i,i+(len-i)));
            i+=(len-i);
            if(i!=str.length())result.append("-");
        }
        }
        return result.toString();
    }
}