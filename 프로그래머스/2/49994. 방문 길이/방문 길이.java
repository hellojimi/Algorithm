import java.util.*;

class Solution {
    private static boolean isValidMove(int mx, int my) {
        return 0 <= mx && mx < 11 && 0 <= my && my < 11;
    }

    private static Map<Character, int[]> location = new HashMap<>();

    private static void initLocation() {
        location.put('U', new int[]{0, 1});
        location.put('D', new int[]{0, -1});
        location.put('L', new int[]{-1, 0});
        location.put('R', new int[]{1, 0});
    }
    
    public int solution(String dirs) {
        initLocation();
        
        int x = 5, y = 5;
        Set<String> answer = new HashSet<>();

        for (int i = 0; i < dirs.length(); i++) {
            int[] offset = location.get(dirs.charAt(i));
            int mx = x + offset[0];
            int my = y + offset[1];

            if (!isValidMove(mx, my)) {
                continue;
            }

            answer.add(String.format("%d %d %d %d", x, y, mx, my));
            answer.add(String.format("%d %d %d %d", mx, my, x, y));

            x = mx;
            y = my;
        }

        return answer.size() / 2;
    }
}