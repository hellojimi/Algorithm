import java.util.*;

class Solution
{
    public int solution(String s)
    {
        if(s == null) return 0;

        ArrayDeque<String> stack = new ArrayDeque();
        
        for(String l : s.split("")) {
            if(!stack.isEmpty() && stack.peek().equals(l)) {
                stack.pop();
            } else {
                stack.push(l);
            }
        }
        
        return stack.isEmpty() ? 1 : 0;
    }
}