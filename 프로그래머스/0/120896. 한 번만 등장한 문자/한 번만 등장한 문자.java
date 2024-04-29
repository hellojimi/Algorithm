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
        
        Collections.sort(list);
        return String.join("", list);
    }
}