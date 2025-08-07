class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count=0;
        for(int i=low;i<=high;i++){
            if(issymmetric(i))count++;
        }return count;
    }
    public static boolean issymmetric(int n){
      String str=Integer.toString(n);
      if(str.length()%2!=0)return false;
      int leftsum=0;
      int rightsum=0;
      int i=0;
      while(i<str.length()/2){
        int value=str.charAt(i)-'0';
        leftsum+=value;  i++; 
      }
      while(i<str.length()){
        int value=str.charAt(i)-'0';
        rightsum+=value;i++;
      }
      return rightsum==leftsum;
    }
}