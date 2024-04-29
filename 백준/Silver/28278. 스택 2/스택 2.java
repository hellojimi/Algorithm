import java.io.*;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack();
        for (int i = 0; i < n; i++) {
            String order = br.readLine();
            char c = order.charAt(0);

            switch (c) {
                case '1':
                    String x = order.substring(2);
                    stack.push(Integer.parseInt(x));
                    break;
                case '2':
                    if (stack.isEmpty()) {
                        bw.write(-1 + "\n");
                    } else {
                        bw.write(stack.pop() + "\n");
                    }
                    break;
                case '3':
                    bw.write(stack.size() + "\n");
                    break;
                case '4':
                    if (stack.isEmpty()) {
                        bw.write(1 + "\n");
                    } else {
                        bw.write(0 + "\n");
                    }
                    break;
                case '5':
                    if (stack.isEmpty()) {
                        bw.write(-1 + "\n");
                    } else {
                        bw.write(stack.peek() + "\n");
                    }
                    break;
                default:
                    break;
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
