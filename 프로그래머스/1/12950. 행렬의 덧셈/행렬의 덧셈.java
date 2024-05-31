import java.util.*;

class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][];
        
        for(int i = 0; i < arr1.length; i++) {
            List<Integer> list = new ArrayList();
            
            for(int j = 0; j < arr1[i].length; j++) {
                list.add(arr1[i][j] + arr2[i][j]);
            }
            
            answer[i] = list.stream().mapToInt(x -> x).toArray();
        }
        
        return answer;
    }
}