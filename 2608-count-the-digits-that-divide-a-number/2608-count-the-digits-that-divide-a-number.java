class Solution {
    public int countDigits(int num) {
        int count=0;
        int original=num;
        while(num>0){
            if((original%(num%10))==0)count++;
            num/=10;
        }
        return count;
    }
}