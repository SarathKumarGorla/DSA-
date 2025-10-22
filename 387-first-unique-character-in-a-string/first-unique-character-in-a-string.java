import java.util.*;
class Solution {
    public int firstUniqChar(String s) {
         Map<Character, Integer> m = new LinkedHashMap<>();
         for(int i=0;i<s.length();i++){
            if(m.containsKey(s.charAt(i))){
                m.put(s.charAt(i),m.get(s.charAt(i))+1);
            }else{
                 m.put(s.charAt(i),1);
            }
         }
         for(Character key : m.keySet()){
              if(m.get(key)==1){
                return s.indexOf(key);
              }
         }
         return -1;
    }
}