import java.util.*;

class Solution {
    
    static Set<Integer> result = new HashSet();
    
    public int[] solution(int[] numbers) {
        combination(numbers, 2, 0, 0, new int[2]);
        
        return result.stream().mapToInt(x -> x).sorted().toArray();
    }
    
    public static void combination(int[] numbers, int depth, int start, int cnt, int[] arr) {
        if (depth == cnt) {
            result.add(Arrays.stream(arr).sum());
            return;
        }
        
        for (int i = start; i < numbers.length; i++) {
            arr[cnt] = numbers[i];
            combination(numbers, depth, i + 1, cnt + 1, arr);
        }
    }
}