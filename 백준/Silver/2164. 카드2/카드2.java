import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

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