import java.io.*;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        Stack stack = new Stack();
        StringBuilder out = new StringBuilder();
        boolean check = true;
        
        for (int i = 0; i < T; i++) {
            String PS = br.readLine();

            for (int j = 0; j < PS.length(); j++) {
                if (PS.charAt(j) == '(') {
                    stack.push('(');
                } else {
                    if (stack.isEmpty()) {
                        check = false;
                        break;
                    } else if(PS.charAt(j) == ')') {
                        stack.pop();
                    }
                }
            }

            if (check && stack.isEmpty()) {
                out.append("YES").append("\n");
            } else {
                out.append("NO").append("\n");
            }
            
            stack.clear();
            check = true;
        }
        System.out.println(out);
    }
}
