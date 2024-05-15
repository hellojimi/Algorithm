class Solution {
    public String solution(int n) {
        String answer = "";
        String odd = "수";
        String even = "박";
        
        for(int i = 1; i <= n; i++) {
            answer += (i % 2 != 0) ? odd : even;
        }
        
        return answer;
    }
}