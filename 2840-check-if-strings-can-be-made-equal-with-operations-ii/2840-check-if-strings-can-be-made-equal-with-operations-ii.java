class Solution {
    public boolean checkStrings(String s1, String s2) {
        int n=s1.length();
        int freq[]=new int[26]; // using hint 2 
        for(int i=0;i<n;i+=2){
            char ch=s1.charAt(i);
            freq[ch-'a']++;
        }
        for(int i=0;i<n;i+=2){
            char ch=s2.charAt(i);
            freq[ch-'a']--;
        }
        for(int a :freq){
            if(a!=0)return false;
        }
        for(int i=1;i<n;i+=2){
            char ch=s1.charAt(i);
            freq[ch-'a']++;
        }
        for(int i=1;i<n;i+=2){
            char ch=s2.charAt(i);
            freq[ch-'a']--;
        }
        for(int a :freq){
            if(a!=0)return false;
        }
        return true;
    }
}