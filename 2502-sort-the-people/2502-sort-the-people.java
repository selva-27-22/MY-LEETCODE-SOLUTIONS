class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        ArrayList<int[]>list=new ArrayList<>();
        for(int i=0;i<names.length;i++){
            list.add(new int[]{i,heights[i]});
        }
        Collections.sort(list,(a,b)->b[1]-a[1]);
        String result[]=new String[names.length];
        for(int i=0;i<names.length;i++){
            result[i]=names[list.get(i)[0]];
        }
        return result;
    }

   
    
}