class Solution {
    public String largestNumber(int[] nums) {
        String arr[]=new String [nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=Integer.toString(nums[i]);
        }
        Arrays.sort(arr,(a,b)->(b+a).compareTo(a+b));
        boolean allzeroes=true;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<arr.length;i++){
            if(arr[i].charAt(0)!='0')allzeroes=false;
            sb.append(arr[i]);
        }
        return allzeroes?"0":sb.toString();
    }
}