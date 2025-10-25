class Solution {
    public int totalMoney(int n) {
        int total=0;
        int count=0;
        int deposit=1;
        int initialdeposit=1;
        while(n>0){
            count++;
            if(count>7){
                count=0;
                count++;
           initialdeposit++;
           deposit=initialdeposit;
            }
            total+=deposit;
            n--;
            deposit++;
        }
        return total;
    }
}