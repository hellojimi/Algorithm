class Solution {
    public int[] solution(int n) {
        int size = n % 2 == 0 ? n / 2 : n / 2 + 1;
        int[] answer = new int[size];
        int j = 0;
        
        for(int i = 1; i <= n; i++) {
            if(i % 2 == 1) {
                answer[j++] = i;
            }
        }
        
        return answer;
    }
}