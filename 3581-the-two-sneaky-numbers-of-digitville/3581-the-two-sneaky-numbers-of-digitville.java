class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int arr[]=new int[2];
        HashSet<Integer>set=new HashSet<>();
        int index=0;
        for(int n:nums){
            if(!set.add(n)){
                arr[index++]=n;
            }
        }return arr;
    }
}