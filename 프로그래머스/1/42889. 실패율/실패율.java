import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] challenges = new int[N + 2];
        for (int i = 0; i < stages.length; i++) {
            challenges[stages[i]] += 1;
        }

        double total = stages.length; // 전체 사용자 수
        Map<Integer, Double> fail = new HashMap<>(); // 실패한 사용자 수

        for (int i = 1; i <= N; i++) {
            if (challenges[i] == 0) {
                fail.put(i, 0.0);
            } else {
                fail.put(i, challenges[i] / total);
                total -= challenges[i];
            }
        }

        return fail.entrySet().stream().sorted(((o1, o2) -> Double.compare(o2.getValue(), o1.getValue())))
                .mapToInt(Map.Entry::getKey).toArray();
    }
}