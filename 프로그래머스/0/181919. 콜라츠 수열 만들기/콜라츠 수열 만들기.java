import java.util.*;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList();

        while (true) {
            list.add(n);
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
            if (n == 1) {
                list.add(n);
                break;
            }
        }

        return list.stream().mapToInt(x -> x).toArray();
    }
}