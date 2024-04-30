import java.util.*;

class Solution {
    public int[] solution(int[] numbers, String direction) {
        Deque<Integer> deque = new ArrayDeque();
        
        for (int num : numbers) {
            deque.addLast(num);
        }

        if ("right".equals(direction)) {
            int data = deque.removeLast();
            deque.addFirst(data);

        } else if ("left".equals(direction)) {
            int data = deque.removeFirst();
            deque.addLast(data);
        }
        
        int[] answer = deque.stream().mapToInt(x -> x).toArray();
        return answer;
    }
}