class Solution {
    boolean solution(String s) {
        if(s.length() == 0) {
            return true;
        }
        
        s = s.toLowerCase();
        int cnt = 0;
        
        for (String x : s.split("")) {
            if ("p".equals(x)) {
                cnt++;
            } else if ("y".equals(x)) {
                cnt--;
            }
        }
        
        return cnt == 0;
    }
}