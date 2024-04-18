import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> names = new HashMap<>();
        for (int i = 0; i < completion.length; i++) {
            names.put(completion[i], names.getOrDefault(completion[i], 0) + 1);
        }

        String answer = "";
        for (String runner : participant) {
            if (names.containsKey(runner) && names.get(runner) != 0) {
                names.put(runner, names.get(runner) - 1);
            } else {
                answer = runner;
                break;
            }
        }
        return answer;
    }
}