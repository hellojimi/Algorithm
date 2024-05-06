import java.util.*;

class Solution {
    public int solution(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap();
        
        for(int i : nums) {
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }
        
        return hm.size() > nums.length / 2 ? nums.length / 2 : hm.size();
    }
}