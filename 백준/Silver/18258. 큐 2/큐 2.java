import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Deque queue = new ArrayDeque();
        StringBuilder out = new StringBuilder();

        for (int i = 0; i < N; i++) {
            String str = br.readLine();

            String[] list = str.split(" ");
            if (list[0].equals("push")) {
                queue.add(list[1]);
            } 
            else if (str.equals("pop")) {
                if (queue.isEmpty()) {
                    out.append(-1 + "\n");
                    continue;
                }
                out.append(queue.poll() + "\n");
            } 
            else if (str.equals("size")) {
                out.append(queue.size() + "\n");
            } 
            else if (str.equals("empty")) {
                out.append(queue.isEmpty() ? 1 : 0);
                out.append("\n");
            } 
            else if (str.equals("front")) {
                if (queue.isEmpty()) {
                    out.append(-1 + "\n");
                    continue;
                }
                out.append(queue.peek() + "\n");
            } 
            else if (str.equals("back")) {
                if (queue.isEmpty()) {
                    out.append(-1 + "\n");
                    continue;
                }
                out.append(queue.getLast() + "\n");
            }
        }
        System.out.println(out);
    }
}