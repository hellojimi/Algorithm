class Solution {
    public String solution(String s) {  
        String[] str = s.split(" ");
        
        int min, max;
        min = Integer.parseInt(str[0]);
        max = Integer.parseInt(str[0]);
        for(int i = 0; i < str.length; i++) {
            int tmp = Integer.parseInt(str[i]);
            
            if(min > tmp) min = tmp;
            if(max < tmp) max = tmp;
        }
        
        return min + " " + max;
    }
}