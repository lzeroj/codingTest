import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i=0; i<phone_book.length; i++){
            map.put(phone_book[i], 1);
        }
    
        for(String a : phone_book){
            for(int i=1; i<a.length(); i++){
                String prefix = a.substring(0, i);
                if(map.containsKey(prefix)){
                    answer = false;
                }
            }
        }
        return answer;
    }
}