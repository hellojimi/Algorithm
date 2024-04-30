import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean checkFlag = true;
        
        if(s.charAt(0) == ')' || s.charAt(s.length() - 1) == '(') {
            return false;
        }
        
        Deque deque = new ArrayDeque();
        for(String w : s.split("")) {
            if(w.equals("(")) {
                deque.addLast(w);
            } else {
                if(deque.isEmpty()) {
                    return false;
                } else {
                    deque.removeLast();
                }
            }
        }
        
        if(checkFlag && !deque.isEmpty()) {
            return false;
        }

        return checkFlag;
    }
}