import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;

        while(i < arr.length) {
            if(list.size() == 0) {
                list.add(arr[i]);
                i += 1;

            } else if(list.size() != 0) {
                int lastNum = list.get(list.size() - 1); // 마지막 인덱스 값

                if(lastNum < arr[i]) {
                    list.add(arr[i]);
                    i += 1;
                } else if(lastNum >= arr[i]) {
                    list.remove(list.size() - 1);
                }
            }
        }

        int[] stk = new int[list.size()];
        for (int j = 0; j < list.size(); j++) {
            stk[j] = list.get(j);
        }
        return stk;
    }
}