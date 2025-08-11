class Solution {
    public int characterReplacement(String s, int k) {
        int freq[]=new int[26];
        int left=0;
        int maxfreq=Integer.MIN_VALUE;
        int maxlen=Integer.MIN_VALUE;
        for(int right=0;right<s.length();right++){
             char ch=s.charAt(right);
             freq[ch-'A']++;
             maxfreq=Math.max(maxfreq,freq[ch-'A']);
             while((right-left+1)-maxfreq>k){
                    freq[s.charAt(left++)-'A']--;
             }
             maxlen=Math.max(maxlen,right-left+1);
        }return maxlen;
        
    }
}