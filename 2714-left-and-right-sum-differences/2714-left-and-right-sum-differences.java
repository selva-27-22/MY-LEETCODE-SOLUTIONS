class Solution {
    public int[] leftRightDifference(int[] nums) {
        int leftsum[]=new int[nums.length];
        int rightsum[]=new int[nums.length];
        int j=nums.length-1;
             rightsum[j]=0;
             
        while(j>0){
            rightsum[j-1]=nums[j]+rightsum[j];
            j--;
        }
        leftsum[0]=0;
        int i=0;
        while(i<nums.length-1){
            leftsum[i+1]=nums[i]+leftsum[i];i++;
        }
        for(int k=0;k<nums.length;k++){
            nums[k]=Math.abs(rightsum[k]-leftsum[k]);
        }return nums;
    }
}