class Solution {
    public int findPoisonedDuration(int[] t, int duration) {
       int result=0;
       for(int i=1;i<t.length;i++){
        if(t[i]-t[i-1]>=duration){
            result+=duration;
        }else{
            result+=t[i]-t[i-1];
        }
        //if(t[i]-t[i-1])
       }return result+duration;
       
    }
}