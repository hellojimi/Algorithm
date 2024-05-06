import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList();
        IntStream.range(1, N + 1).forEach(queue::add);

        while (!queue.isEmpty()) {
            if (queue.size() == 1) {
                System.out.println(queue.peek());
                break;
            }

            queue.poll();
            int data = queue.remove();
            queue.add(data);
        }
    }
}