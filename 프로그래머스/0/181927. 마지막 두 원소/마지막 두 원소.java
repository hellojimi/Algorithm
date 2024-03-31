class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];
        
        for(int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[i];
        }
        
        int num = num_list[num_list.length - 2];
        int lastNum = num_list[num_list.length - 1];
        
        answer[num_list.length] = num < lastNum ? lastNum - num : lastNum * 2;

        return answer;
    }
}