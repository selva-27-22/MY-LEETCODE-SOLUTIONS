class Solution {
    public List<Integer> replaceNonCoprimes(int[] arr) {
        List<Long>list=new ArrayList<>();
        for(int num:arr){
            list.add((long)num);
            while(list.size()>1){
                int n=list.size();
                long a =list.get(n-1);
                long b=list.get(n-2);
                long g=gcd(a,b);
                if(g==1)break;
                long lcm=(a*b)/g;
                list.remove(n-1);
                list.remove(n-2);
                list.add(lcm);
            }
        }
        List<Integer>result=new ArrayList<>();
        for(long a :list){
            result.add((int)a);
        }
        return result; 
    }  
    public static long gcd(long a ,long b){
        while(b!=0){
            long temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}