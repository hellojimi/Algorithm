import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        Deque<Integer> deque = new ArrayDeque();

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            char c = str.charAt(0);

            switch (c) {
                case '1':
                    String x = str.substring(2);
                    deque.addFirst(Integer.parseInt(x));
                    break;
                case '2':
                    x = str.substring(2);
                    deque.addLast(Integer.parseInt(x));
                    break;
                case '3':
                    if (deque.isEmpty()) {
                        bw.write(-1 + "\n");
                    } else {
                        bw.write(deque.removeFirst() + "\n");
                    }
                    break;
                case '4':
                    if (deque.isEmpty()) {
                        bw.write(-1 + "\n");
                    } else {
                        bw.write(deque.removeLast() + "\n");
                    }
                    break;
                case '5':
                    bw.write(deque.size() + "\n");
                    break;
                case '6':
                    if (deque.isEmpty()) {
                        bw.write(1 + "\n");
                    } else {
                        bw.write(0 + "\n");
                    }
                    break;
                case '7':
                    if (deque.isEmpty()) {
                        bw.write(-1 + "\n");
                    } else {
                        bw.write(deque.getFirst() + "\n");
                    }
                    break;
                case '8':
                    if (deque.isEmpty()) {
                        bw.write(-1 + "\n");
                    } else {
                        bw.write(deque.getLast() + "\n");
                    }
                    break;
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}