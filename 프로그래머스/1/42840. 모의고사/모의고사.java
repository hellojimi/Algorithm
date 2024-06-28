import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[][] answer = {
            {1, 2, 3, 4, 5},
            {2, 1, 2, 3, 2, 4, 2, 5},
            {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };
        
        int[] scores = new int[3];
        
        // 각 점수
        for(int i = 0; i < answers.length; i++) {
            for(int j = 0; j < answer.length; j++) {
                if(answers[i] == answer[j][i % answer[j].length]) {
                    scores[j]++;
                }
            }
        }
        
        int maxScore = Arrays.stream(scores).max().getAsInt();
        
        List<Integer> person = new ArrayList();
        for(int i = 0; i < scores.length; i++) {
            if(maxScore == scores[i]) {
                person.add(i + 1);
            }
        }
        
        Collections.sort(person);
        
        return person.stream().mapToInt(Integer::intValue).toArray();
    }
}