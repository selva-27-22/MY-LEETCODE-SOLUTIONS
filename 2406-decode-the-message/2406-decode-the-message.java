class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character,Character>map=new HashMap<>();
        StringBuilder sb=new StringBuilder ();
        char next='a';
        for(char c:key.toCharArray()){
                if(c==' ')continue; 
               if(!map.containsKey(c)){
                map.put(c,next++);
                if(next>'z')break;
               }
        }
        for(char c :message.toCharArray()){
            if(c==' ')sb.append(' ');
            else{
                sb.append(map.get(c));
            }
        }return sb.toString();
        }
    }
