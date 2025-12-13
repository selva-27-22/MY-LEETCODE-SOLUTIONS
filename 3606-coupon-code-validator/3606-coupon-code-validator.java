class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        List<String>result=new ArrayList<>();
        int n=code.length;
        HashMap<String,Integer>priority=new HashMap<>(); //Creating map for priority
        priority.put("electronics",0);
        priority.put("grocery",1);
        priority.put("pharmacy",2);
        priority.put("restaurant",3);
        List<int[]>list=new ArrayList<>();// for sorting based on two things 
        for(int i=0;i<n;i++){
            if(isActive[i]){ // if it is active
                String b=businessLine[i];
                if(!(priority.containsKey(b)))continue; // if it is one of the 4 given types
                String str=code[i];
                boolean valid=true;
                if(str.length()==0)continue;// empty checking
                // for eliminating invalid ones
                for(char ch:str.toCharArray()){
                    if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z')||ch=='_'||ch>='0'&&ch<='9')continue;
                    else{
                        valid=false;
                        break;
                    }
                }
                if(valid){
                    // storing priority with help of map and storing the index of code for storing in result
                    list.add(new int[]{priority.get(businessLine[i]),i});
                }
            }
        }
        // Now as it is said in the question first we have to compare based on order in businessline
         
        list.sort((a,b)->{
            // if it has different priorities then smaller one will come first a[0]-b[0] will do that
            if(a[0]!=b[0])return a[0]-b[0];
            // if both are same business line then just use compare two strings and put the smaller ones first by using compareTo 
            return code[a[1]].compareTo(code[b[1]]);
        });
        for(int[]a:list){
            result.add(code[a[1]]);
        }
        return result;
    }
}