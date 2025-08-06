class Solution {
    public int calPoints(String[] operations) {
      Stack<Integer>stack=new Stack<>();int sum=0;
      for(int i=0;i<operations.length;i++){
        
        if(operations[i].length()>1){
        stack.push(Integer.parseInt(operations[i]));}
        else{
            char ch=operations[i].charAt(0);
            if(ch>='0'&&ch<='9'){
                stack.push(ch-'0');

            }else if(ch=='C') stack.pop();
            else if(ch=='D')stack.push(stack.peek()*2);
            else if(ch=='+'){
                int temp=stack.pop();
                int current=temp+stack.peek();
                stack.push(temp);
                stack.push(current);
            }
        }
      }
      for(int num:stack){
        sum+=num;
      }return sum;
    }
}