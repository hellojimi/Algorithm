import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] strings = s.split("");
        Arrays.sort(strings, Collections.reverseOrder());

        for(String str : strings) {
            answer += str;
        }
        
        return answer;
    }
}