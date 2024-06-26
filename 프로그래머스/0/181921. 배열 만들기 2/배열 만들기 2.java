import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        int[] answer = {};
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
        
        if(list.isEmpty()) {
            answer = new int[] {-1};
        } else {
            answer = list.stream().mapToInt(x -> x).toArray();
        }
        
        return answer;
    }
}