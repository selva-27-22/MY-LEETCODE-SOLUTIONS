class Solution {
    public int minSteps(String s, String t) {
        int tfreq[]=new int[26];
        int sfreq[]=new int[26];
        int steps=0;
        for(char ch:s.toCharArray()){
            sfreq[ch-'a']++;
        }
        for(char ch:t.toCharArray()){
            tfreq[ch-'a']++;
        }
        for(int i=0;i<26;i++){
            if(sfreq[i]<tfreq[i])steps+=tfreq[i]-sfreq[i];

        }
        return steps;
    }
}