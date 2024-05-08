class Solution {
    public int[] solution(long n) {
        String s = Long.toString(n);
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();

        int[] answer = new int[s.length()];
        for (int i = 0; i < answer.length; i++) {
            char c = sb.charAt(i);
            answer[i] = c - '0';
        }
        
        return answer;
    }
}