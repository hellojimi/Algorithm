class Solution {
    boolean solution(String s) {
        if(s.length() == 0) {
            return true;
        }
        
        int pCnt = 0;
        int yCnt = 0;
        
        for (String x : s.split("")) {
            if ("p".equals(x) || "P".equals(x)) {
                pCnt++;
            } else if ("y".equals(x) || "Y".equals(x)) {
                yCnt++;
            }
        }
        
        return pCnt == yCnt ? true : false;
    }
}