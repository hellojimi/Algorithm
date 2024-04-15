import java.util.Stack;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        Stack<Integer> stack = new Stack<>();
        for (String string : s.split(" ")) {
            if (string.equals("Z")) {
                stack.pop();
            } else {
                stack.push(Integer.parseInt(string));
            }
        }

        while (!stack.isEmpty()) {
            answer = answer + stack.pop();
        }
        return answer;
    }
}