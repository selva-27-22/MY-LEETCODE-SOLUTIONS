class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0;
        int product=1;
        while(n>0){
            int value=n%10;
            sum+=value;
            product*=value;
            n/=10;
        }return product-sum;
    }
}