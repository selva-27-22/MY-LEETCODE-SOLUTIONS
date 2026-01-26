class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>>result=new ArrayList<>();
        int min=Integer.MAX_VALUE;
        int n=arr.length;
        Arrays.sort(arr);
        for(int i=1;i<n;i++){
            int diff=arr[i]-arr[i-1];
            min=Math.min(min,diff);
        }
        for(int i=1;i<n;i++){
            int diff=arr[i]-arr[i-1];
            if(diff==min){
                List<Integer>list=new ArrayList<>();
                list.add(arr[i-1]);
                list.add(arr[i]);
                result.add(list);
            }
        }
        return result;
    }
}