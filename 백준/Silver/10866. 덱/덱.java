import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Deque deque = new ArrayDeque();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            String str = br.readLine();

            String[] line = str.split(" ");
            if ("push_front".equals(line[0])) {
                deque.addFirst(line[1]);
            } else if ("push_back".equals(line[0])) {
                deque.addLast(line[1]);
            } else if ("pop_front".equals(str)) {
                if (deque.isEmpty()) {
                    sb.append(-1).append("\n");
                    continue;
                }
                sb.append(deque.pollFirst()).append("\n");
            } else if ("pop_back".equals(str)) {
                if (deque.isEmpty()) {
                    sb.append(-1).append("\n");
                    continue;
                }
                sb.append(deque.pollLast()).append("\n");
            } else if ("size".equals(str)) {
                sb.append(deque.size()).append("\n");
            } else if ("empty".equals(str)) {
                int data = deque.isEmpty() ? 1 : 0;
                sb.append(data).append("\n");
            } else if ("front".equals(str)) {
                if (deque.isEmpty()) {
                    sb.append(-1).append("\n");
                    continue;
                }
                sb.append(deque.getFirst()).append("\n");
            } else if ("back".equals(str)) {
                if (deque.isEmpty()) {
                    sb.append(-1).append("\n");
                    continue;
                }
                sb.append(deque.getLast()).append("\n");
            }
        }
        System.out.println(sb);
    }
}