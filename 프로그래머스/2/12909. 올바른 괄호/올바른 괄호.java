import java.util.*;

class Solution {
    boolean solution(String s) {
        if(s.charAt(0) == ')' || s.charAt(s.length() - 1) == '(') {
            return false;
        }
        
        boolean flag = true;

        Deque deque = new ArrayDeque();
        for(String str : s.split("")) {
            if(str.equals("(")) {
                deque.addLast(str);
            } else {
                if(deque.isEmpty()) {
                    return false;
                } else {
                    deque.removeLast();
                }
            }
        }
        
        if(flag && !deque.isEmpty()) {
            return false;
        }

        return flag;
    }
}