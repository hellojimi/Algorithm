import java.io.*;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        String[] ps = new String[num];
        Stack stack = new Stack();
        boolean flag = true;

        for (int i = 0; i < num; i++) {
            ps[i] = br.readLine();
        }

        for (int i = 0; i < ps.length; i++) {
            for (String vps : ps[i].split("")) {
                if (vps.equals("(")) {
                    stack.push(vps);
                } else {
                    if (stack.isEmpty()) {
                        flag = false;
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }

            if (flag && stack.isEmpty()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

            stack.clear();
            flag = true;
        }

    }
}