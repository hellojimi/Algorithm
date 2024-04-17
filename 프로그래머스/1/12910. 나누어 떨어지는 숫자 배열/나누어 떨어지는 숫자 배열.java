import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                list.add(arr[i]);
            }
        }
        Collections.sort(list);

        int[] result;
        if (list.size() != 0) {
            result = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                result[i] = list.get(i);
            }
        } else {
            result = new int[1];
            result[0] = -1;
        }
        return result;
    }
}