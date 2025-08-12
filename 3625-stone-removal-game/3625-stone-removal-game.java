class Solution {
    public boolean canAliceWin(int n) {
        if(n<10)return false;
        int start=10;int count=0;
        while(true){
            n-=start;
            start-=1;
            count++;
            if(n<start)return count%2!=0;
        }
    }
}