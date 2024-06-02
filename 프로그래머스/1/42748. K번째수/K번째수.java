import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for (int c = 0; c < commands.length; c++) {
            int i = commands[c][0];
            int j = commands[c][1];
            int k = commands[c][2];

            List<Integer> list = new ArrayList();
            for (int l = i - 1; l < j; l++) {
                list.add(array[l]);
            }
            Collections.sort(list);
            answer[c] = list.get(k - 1);

            list.clear();
        }
        
        return answer;
    }
}