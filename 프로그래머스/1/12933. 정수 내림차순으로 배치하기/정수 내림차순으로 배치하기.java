import java.util.*;

class Solution {
    public long solution(long n) {
        String[] nums = Long.toString(n).split("");
        Arrays.sort(nums);
        
        StringBuilder sb = new StringBuilder();
        for(String num : nums) {
            sb.append(num);
        }
        
        return Long.parseLong(sb.reverse().toString());
    }
}