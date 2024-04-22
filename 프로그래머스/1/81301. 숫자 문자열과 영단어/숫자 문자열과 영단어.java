class Solution {
    public int solution(String s) {
        String[] strs = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for(int i = 0; i < strs.length; i++) {
            if (s.contains(strs[i])) {
                s = s.replace(strs[i], Integer.toString(i));
            }
        }
        
        return Integer.parseInt(s);
    }
}