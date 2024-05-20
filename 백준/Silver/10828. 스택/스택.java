import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack();
        while (n != 0) {
            String str = br.readLine();
            Integer result = PrintStack(stack, str);
            if (result != null) {
                System.out.println(result);
            }

            n--;
        }
    }

    private static Integer PrintStack(Stack<Integer> stack, String str) {
        switch (str) {
            case "pop":
                if (stack.isEmpty()) {
                    return -1;
                }

                return stack.pop();
            case "size":
                return stack.size();

            case "empty":
                return stack.isEmpty() ? 1 : 0;

            case "top":
                if (stack.isEmpty()) {
                    return -1;
                }

                return stack.peek();
            default:
                stack.push(Integer.parseInt(str.substring(5)));
                break;
        }

        return null;
    }
}