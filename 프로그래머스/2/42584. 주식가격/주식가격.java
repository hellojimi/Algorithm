import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int n = prices.length;
        int[] answer = new int[n];  // 가격이 떨어지지 않은 기간
        
        ArrayDeque<Integer> stack = new ArrayDeque();
        stack.push(0);
        
        for(int i = 1; i < n; i++) {
            while(!stack.isEmpty() && prices[i] < prices[stack.peek()]) {
                // 가격이 떨어졌으므로 이전 가격의 기간 계산
                int j = stack.pop();
                answer[j] = i - j;
            }
            stack.push(i);
        }
        
        // 가격이 떨어지지 않은 경우
        while(!stack.isEmpty()) {
            int j = stack.pop();
            answer[j] = n - 1 - j;
        }
        
        return answer;
    }
}