import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        HashMap<String, Integer> hm = new HashMap();
        for(String str : s.split("")) {
            hm.put(str, hm.getOrDefault(str, 0) + 1);
        }
        
        List<String> list = new ArrayList<>();
        for(String str : hm.keySet()) {
            if(hm.get(str) == 1) {
                list.add(str);
            }
        }
        
        if(list.size() == 0) {
            return answer;
            
        } else {
            Collections.sort(list);
            for(String str : list) {
                answer += str;
            }
        }
        
        return answer;
    }
}