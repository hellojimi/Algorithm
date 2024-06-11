import java.util.*;

class Solution {
    static int answer;
    
    public int solution(int[] number) {
        combination(number, 3, 0, 0, new int[3]);
        return answer;
    }
    
    public static void combination(int[] number, int depth, int start, int cnt, int[] arr) {
        if (depth == cnt) {
            answer += Arrays.stream(arr).sum() == 0 ? 1 : 0;
            return;
        }

        for (int i = start; i < number.length; i++) {
            arr[cnt] = number[i];
            combination(number, depth, i + 1, cnt + 1, arr);
        }
    }
}