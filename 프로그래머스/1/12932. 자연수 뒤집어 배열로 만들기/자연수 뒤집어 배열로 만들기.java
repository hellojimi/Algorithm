import java.util.*;

class Solution {
    public ArrayList<Integer> solution(long n) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        String num = Long.toString(n);
        for (int i = num.length() - 1; i >= 0; i--) {
            char ch = num.charAt(i);
            answer.add(ch - '0');
        }
        
        return answer;
    }
}