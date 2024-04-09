class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr;
        
        for(int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            
            for(int j = 0; j < arr.length; j++) {
                if(s <= j && j <= e && j % k == 0) {
                    answer[j] += 1;
                } 
            }
        }   
        return answer;
    }
}