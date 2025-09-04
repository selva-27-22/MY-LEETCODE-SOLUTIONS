class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int max=Integer.MIN_VALUE;
        for(int a:arr1){
            max=Math.max(a,max);
        }
        int freq[]=new int[max+1];
        for(int a:arr1){
            freq[a]++;
        }
        int index=0;
        for(int a :arr2){
            while(freq[a]>0){
                arr1[index++]=a;
                freq[a]--;
            }
        }
        for(int i=0;i<=max;i++){
            while(freq[i]>0){
                arr1[index++]=i;
                freq[i]--;
            }
        }
        return arr1;
    }
}