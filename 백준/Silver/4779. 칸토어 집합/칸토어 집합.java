import java.io.*;

public class Main {
    static StringBuilder answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";

        while ((str = br.readLine()) != null && !str.isEmpty()) {
            int N = Integer.parseInt(str);

            answer = new StringBuilder();
            int len = (int) Math.pow(3, N);

            answer.append("-".repeat(len));

            cantor(0, len);
            System.out.println(answer);
        }
    }

    public static void cantor(int start, int size) {
        if (size == 1) {
            return;
        }

        int newSize = size / 3;
        for (int i = start + newSize; i < start + 2 * newSize; i++) {
            answer.setCharAt(i, ' ');
        }

        cantor(start, newSize);
        cantor(start + 2 * newSize, newSize);
    }
}
