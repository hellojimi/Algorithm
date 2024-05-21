import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Stack stack = new Stack();
        StringBuilder out = new StringBuilder();

        for (int i = 0; i < N; i++) {
            String str = br.readLine();

            String[] line = str.split(" ");
            if ("push".equals(line[0])) {
                stack.push(line[1]);
            }
            else if ("pop".equals(str)) {
                if (stack.isEmpty()) {
                    out.append(-1 + "\n");
                    continue;
                }
                out.append(stack.pop() + "\n");
            }
            else if ("size".equals(str)) {
                out.append(stack.size() + "\n");
            }
            else if ("empty".equals(str)) {
                out.append(stack.isEmpty() ? 1 : 0);
                out.append("\n");
            }
            else {
                if (stack.isEmpty()) {
                    out.append(-1 + "\n");
                    continue;
                }
                out.append(stack.peek() + "\n");
            }
        }
        System.out.println(out);
    }
}