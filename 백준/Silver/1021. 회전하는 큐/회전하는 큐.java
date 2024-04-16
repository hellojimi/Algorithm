import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]); // n개 원소
        int m = Integer.parseInt(input[1]); // 뽑아내려고 하는 수의 개수
        
        String[] str = br.readLine().split(" ");
        int[] numbers = new int[str.length]; // 뽑고자 하는 원소 배열
        for (int i = 0; i < str.length; i++) {
            numbers[i] = Integer.parseInt(str[i]);
        }

        LinkedList queue = new LinkedList(); // 1 ~ N까지 큐에 담기
        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        int cnt = 0;
        for (int i = 0; i < m; i++) {
            int targetIdx = queue.indexOf(numbers[i]);
            int halfIdx = 0;

            if (queue.size() % 2 == 0) { // 중간 지점 찾기
                halfIdx = queue.size() / 2 - 1;
            } else {
                halfIdx = queue.size()/ 2;
            }

            if (targetIdx <= halfIdx) {
                // 왼쪽으로 이동(2번 연산)
                for (int j = 0; j < targetIdx; j++) {
                    int data = (int) queue.remove();
                    queue.add(data);
                    cnt++;
                }
                queue.remove();
                
            } else {
                // 오른쪽으로 이동 (3번 연산)
                for (int j = 0; j < queue.size() - targetIdx; j++) {
                    int data = (int)queue.pollLast();
                    queue.addFirst(data);
                    cnt++;
                }
                queue.remove();
            }
        }
        System.out.println(cnt);
    }
}