class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n=A.length;
        int freq[]=new int[n+1];
        int result[]=new int[n];
        int count=0;
        for(int i=0;i<n;i++){
            if(A[i]!=B[i]){
            freq[A[i]]++;
            freq[B[i]]++;
            if(freq[A[i]]==2)count++;
            if(freq[B[i]]==2)count++;
            }
            else{
                freq[A[i]]+=2;
                if(freq[A[i]]==2)count++;
            }
            result[i]=count;
        }
    return result;
    }
}