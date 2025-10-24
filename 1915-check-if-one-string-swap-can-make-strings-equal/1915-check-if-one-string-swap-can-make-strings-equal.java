class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int unequal=0;
        int freq[]=new int [26];
        for(int i=0;i<s1.length();i++){
            char ch1=s1.charAt(i);
            char ch2=s2.charAt(i);
            if(ch1!=ch2)unequal++;
            if(unequal>2)return false;
            freq[ch1-'a']++;
            freq[ch2-'a']--;
        }
        for(int a :freq){
            if(a!=0)return false;
        }
        return true;
    }
}