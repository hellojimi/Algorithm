import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> list = new ArrayList();
        
        for (int i = l; i <= r; i++) {
            String str = i + "";
            int cnt = 0;

            for (String s : str.split("")) {
                if (s.equals("5") || s.equals("0")) {
                    cnt++;
                }
            }

            if (str.length() == cnt) {
                list.add(Integer.parseInt(str));
            }
        }

        int[] answer = list.stream().mapToInt(x -> x).toArray();
        
        if(answer.length == 0) {
            answer = new int[1];
            answer[0] = -1;
        } 
        
        return answer;
    }
}