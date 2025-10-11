class Solution {
    public int findNonMinOrMax(int[] nums) {
        if(nums.length<=2)return -1;
       int max=Integer.MIN_VALUE;
       int min=Integer.MAX_VALUE;
       for(int a :nums){
        min=Math.min(min,a);
        max=Math.max(max,a);
       }
       for(int a :nums){
        if(a!=max&&a!=min)return a;
       }
       return -1;
    }
    private static void countingsort(int arr[]){
       int max=Integer.MIN_VALUE;
       for(int a :arr){
        max=Math.max(max,a);
       }
       int freq[]=new int[max+1];
       for(int a:arr){
        freq[a]++;
       }
       int index=0;
       for(int i=0;i<freq.length;i++){
        while(freq[i]>0){
            arr[index++]=i;
            freq[i]--;
        }
       }
    }
}