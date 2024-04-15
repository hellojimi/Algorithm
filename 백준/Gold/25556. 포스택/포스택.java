import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[] strs = br.readLine().split(" ");
        ArrayList<Integer> list = new ArrayList<>();
        for (String str : strs) {
            list.add(Integer.parseInt(str));
        }

        Stack<Integer>[] stacks = new Stack[4];
        for (int i = 0; i < stacks.length; i++) {
            stacks[i] = new Stack<>();
            stacks[i].push(0);
        }

        for (int i = 0; i < n; i++) {
            boolean flag = false;
            for (int j = 0; j < stacks.length; j++) {
                if (stacks[j].peek() < list.get(i)) {
                    stacks[j].push(list.get(i));
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
