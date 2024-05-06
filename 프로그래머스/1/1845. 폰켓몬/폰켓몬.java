import java.util.*;

class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> hs = new HashSet();
        
        for(int i : nums) {
            hs.add(i);
        }
        
        return Math.min(hs.size(), nums.length / 2);
    }
}